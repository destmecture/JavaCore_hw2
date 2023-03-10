package transport;

import Enum.CarBodyType;
import drivers.DriverB;

import java.util.List;

public class Car extends Transport{

    private CarBodyType carBodyType;

    public Car(String brand,
               String model,
               double enginePower,
               DriverB driver,
               CarBodyType carBodyType,
               List mechanicsList) {
        super(brand, model, enginePower, driver, mechanicsList);
        this.carBodyType = carBodyType;

    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }
    public void printType() {
        if(carBodyType==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else{
            System.out.println(carBodyType);
        }
    }

    @Override
    public void passDiagnostic() {
        System.out.println("Автомобиль продиагностирован");
    }

    @Override
    public void startMove() {
        System.out.println("Car started");
    }

    @Override
    public void finish() {
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