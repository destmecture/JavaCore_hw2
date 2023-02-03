package transport;

import Enum.PassengerSeats;
import drivers.DriverD;

import java.util.List;


public class Bus extends Transport {
    private PassengerSeats passengerSeats;

    public Bus(String brand,
               String model,
               double enginePower,
               DriverD driver,
               PassengerSeats passengerSeats,
               List mechanicsList) {
        super(brand, model, enginePower,driver, mechanicsList);
        this.passengerSeats = passengerSeats;

    }

    public PassengerSeats getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(PassengerSeats passengerSeats) {
        this.passengerSeats = passengerSeats;
    }
    public void printType() {
        if(passengerSeats==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else{
            System.out.println(passengerSeats);
        }
    }

    @Override
    public void passDiagnostic() {
        try {
            throw new TransportTypeException("Автобусы не должны проходить диагностику");
        } catch (TransportTypeException a) {
            a.printStackTrace();
        }
    }

    @Override
    public void startMove() {
        System.out.println("Bus started");
    }

    @Override
    public void finish() {
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
