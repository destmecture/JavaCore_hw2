package transport;

import drivers.Driver;

import static transport.ValidationUtilities.*;
public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double enginePower;
    private Driver driver;


    protected Transport(String brand, String model, double enginePower, Driver driver) {
        this.brand = checkStringValidation(brand);
        this.model = checkStringValidation(model);
        this.enginePower = checkDoubleValidation(enginePower);
        this.driver = driver;

    }

    //region getters

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginePower() {
        return enginePower;
    }

    //endregion

    public Driver getDriver() {
        return this.driver;
    }


    abstract void startMove();

    abstract void finish();


}
