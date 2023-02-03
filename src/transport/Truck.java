package transport;

import Enum.WeightCapacity;
import drivers.DriverC;

import java.util.List;

public class Truck extends Transport{

    private WeightCapacity weightCapacity;
    public Truck(String brand,
                 String model,
                 double enginePower,
                 DriverC driver,
                 WeightCapacity weightCapacity,
                 List mechanicsList) {
        super(brand, model, enginePower, driver, mechanicsList);
        this.weightCapacity = weightCapacity;
    }

    public WeightCapacity getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(WeightCapacity weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void passDiagnostic() {
        System.out.println("Грузовик продиагностирован");
    }
    @Override
    public void printType() {
        if(weightCapacity==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else{
            System.out.println(weightCapacity);
        }
    }

    @Override
    public void startMove() {
        System.out.println("Truck started");
    }

    @Override
    public void finish() {
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