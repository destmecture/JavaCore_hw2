import Enum.CarBodyType;
import Enum.PassengerSeats;
import Enum.WeightCapacity;
import Service.Mechanic;
import Service.ServiceStation;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Ivan", true, 5);
        DriverC driverC = new DriverC("Alexey", true, 7);
        DriverD driverD = new DriverD("Sergey", true, 10);
        DriverD driverD2 = new DriverD("Sergey", true, 10);

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(new Mechanic("Иван", "Иванов", "Тетра"));
        mechanics.add(new Mechanic("Василий", "Васильев", "Оптима"));
        mechanics.add(new Mechanic("Алексей", "Алексеев", "Эмви"));


        Car car = new Car("Alpha", "Romeo", 2.4, driverB, CarBodyType.Coupe, mechanics);
        Truck truck = new Truck("Scania", "Odin", 5.5, driverC, WeightCapacity.N1, mechanics);
        Bus bus = new Bus("Mercedes", "sprinter", 2.2, driverD, PassengerSeats.EXTRALARGE, mechanics);
        Bus bus2 = new Bus("Mercedes", "sprinter", 2.2, driverD, null, mechanics);

        Set<String> driverSet = new HashSet<>();
        driverSet.add(driverB.getName());
        driverSet.add(driverC.getName());
        driverSet.add(driverD.getName());
        driverSet.add(driverB.getName()); //проверка повторного добавления добавления

        Iterator<String> driverIterator = driverSet.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }

        System.out.println("______________");

        List<Transport> transportList = new ArrayList<>();
        transportList.add(car);
        transportList.add(truck);
        transportList.add(bus);
        transportList.add(bus2);

        Map<Transport, StringBuilder> carAndMechanics = new HashMap<>();
        carAndMechanics.put(car, car.getMechanicsList());
        carAndMechanics.put(truck, truck.getMechanicsList());
        carAndMechanics.put(bus, bus.getMechanicsList());
        carAndMechanics.put(bus2, bus2.getMechanicsList());

        for (Map.Entry<Transport, StringBuilder> out : carAndMechanics.entrySet()) {
            System.out.println(out.getKey().getBrand()+" "+out.getKey().getModel()+" Уникальный номер транспорта: "
                    +out.getKey()+" Список механиков, закрепленных за данным авто: "
                    +out.getValue());
        }
        System.out.println("______________");


        mechanics.get(0).performMaintenance(car);                //Проведение ТО
        mechanics.get(1).performMaintenance(truck);
        mechanics.get(2).performMaintenance(bus);
        System.out.println("______________");

        mechanics.get(0).fixCar(car);                        //Починка авто
        mechanics.get(0).fixCar(truck);
        mechanics.get(0).fixCar(bus);
        System.out.println("______________");

        System.out.println("Имя водителя автомобиля "+car.getDriver().getName());     //Получаем имя водителя
        System.out.println("Имя водителя автобуса "+bus.getDriver().getName());
        System.out.println("Имя водителя грузовика "+truck.getDriver().getName());
        System.out.println("______________");

        System.out.println(car.getMechanicsList());                 //Список механиков для всех ТО будет одинаковый
        System.out.println("______________");

        ServiceStation.addTransportInQueue(bus);                     //Добавляем авто в очередь на ТО
        ServiceStation.addTransportInQueue(car);
        ServiceStation.addTransportInQueue(truck);
        System.out.println("______________");

        ServiceStation.getTechnicalInspection();                      //Сообщение о прохождении ТО
        ServiceStation.getTechnicalInspection();
        System.out.println("______________");

        getInfo(car);
        getInfo(truck);
        getInfo(bus);
        System.out.println("______________");

        truck.printType();
        bus.printType();
        car.printType();
        bus2.printType();
        System.out.println("______________");

        bus.passDiagnostic();
        car.passDiagnostic();
        truck.passDiagnostic();







    }

    public static void getInfo(Transport transport) {
        System.out.println("Driver "+transport.getDriver().getName()+" управляет транспортным средством "
                +transport.getBrand()+" "+transport.getModel()+" и может участвовать в заезде");
    }
}
