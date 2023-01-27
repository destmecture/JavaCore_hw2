package transport;

import drivers.DriverB;
import drivers.DriverC;

public class Truck extends Transport{


    public Truck(String brand,
                 String model,
                 double enginePower, DriverC driver) {
        super(brand, model, enginePower, driver);
    }


    @Override
    void startMove() {
        System.out.println("Truck started");
    }

    @Override
    void finish() {
        System.out.println("Truck finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Truck is on a pit stop");
    }

    @Override
    public void getBestCircleTime() {
        double time = Math.random() * ((12.00 - 10.00) + 1) + 10.00;
        System.out.println("Best lapse time for truck is = "+time);

    }

    @Override
    public void getMaxSpeed() {
        int speed = (int)(Math.random() * ((100 - 80) + 1) + 80);
        System.out.println("Max speed for truck is = "+speed);
    }

}