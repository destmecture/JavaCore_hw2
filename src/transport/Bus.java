package transport;

import drivers.DriverD;

public class Bus extends Transport{

    public Bus(String brand,
               String model,
               double enginePower, DriverD driver) {
        super(brand, model, enginePower,driver);

    }


    @Override
    void startMove() {
        System.out.println("Bus started");
    }

    @Override
    void finish() {
        System.out.println("Bus finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Bus is on a pit stop");
    }

    @Override
    public void getBestCircleTime() {
        double time = Math.random() * ((10.00 - 8.00) + 1) + 8.00;
        System.out.println("Best lapse time for bus is = "+time);

    }

    @Override
    public void getMaxSpeed() {
        int speed = (int)(Math.random() * ((120 - 100) + 1) + 100);
        System.out.println("Max speed for bus is = "+speed);
    }

}
