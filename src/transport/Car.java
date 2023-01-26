package transport;

import drivers.DriverB;

public class Car extends Transport{


    public Car(String brand,
               String model,
               double enginePower,
               DriverB driver) {
        super(brand, model, enginePower, driver);

    }


    @Override
    void startMove() {
        System.out.println("Car started");
    }

    @Override
    void finish() {
        System.out.println("Car finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Car is on a pit stop");
    }

    @Override
    public void getBestCircleTime() {
        double time = Math.random() * ((8.00 - 6.00) + 1) + 6.00;
        System.out.println("Best lapse time for car is = "+time);

    }

    @Override
    public void getMaxSpeed() {
        int speed = (int)(Math.random() * ((160 - 140) + 1) + 140);
        System.out.println("Max speed for car is = "+speed);
    }


}