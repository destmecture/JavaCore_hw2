import drivers.*;
import transport.*;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Ivan", true, 5);
        DriverC driverC = new DriverC("Alexey", true, 7);
        DriverD driverD = new DriverD("Sergey", true, 10);

        Car car = new Car("Alpha", "Romeo", 2.4, driverB);
        Truck truck = new Truck("Scania", "Odin", 5.5, driverC);
        Bus bus = new Bus("Mercedes", "sprinter", 2.2, driverD);

        getInfo(car);
        getInfo(truck);
        getInfo(bus);

    }

    public static void getInfo(Transport transport) {
        System.out.println("Driver "+transport.getDriver().getName()+" управляет транспортным средством "
                +transport.getBrand()+" "+transport.getModel()+" и может участвовать в заезде");
    }
}
