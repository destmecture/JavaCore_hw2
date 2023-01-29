import Enum.*;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;



public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Ivan", true, 5);
        DriverC driverC = new DriverC("Alexey", true, 7);
        DriverD driverD = new DriverD("Sergey", true, 10);

        Car car = new Car("Alpha", "Romeo", 2.4, driverB, CarBodyType.Coupe);
        Truck truck = new Truck("Scania", "Odin", 5.5, driverC, WeightCapacity.N1);
        Bus bus = new Bus("Mercedes", "sprinter", 2.2, driverD, PassengerSeats.EXTRALARGE);
        Bus bus2 = new Bus("Mercedes", "sprinter", 2.2, driverD, null);

        getInfo(car);
        getInfo(truck);
        getInfo(bus);



        truck.printType();
        bus.printType();
        car.printType();
        bus2.printType();


    }

    public static void getInfo(Transport transport) {
        System.out.println("Driver "+transport.getDriver().getName()+" управляет транспортным средством "
                +transport.getBrand()+" "+transport.getModel()+" и может участвовать в заезде");
    }
}
