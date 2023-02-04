package transport;

import Service.Mechanic;
import drivers.Driver;

import java.util.List;

import static utilities.ValidationUtilities.checkDoubleValidation;
import static utilities.ValidationUtilities.checkStringValidation;
public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double enginePower;
    private Driver driver;
    private List<Mechanic> mechanicsList;


    protected Transport(String brand, String model, double enginePower, Driver driver, List<Mechanic> mechanicsList) {
        this.brand = checkStringValidation(brand);
        this.model = checkStringValidation(model);
        this.enginePower = checkDoubleValidation(enginePower);
        this.driver = driver;
        this.mechanicsList = mechanicsList;

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

    public StringBuilder getMechanicsList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mechanicsList.size(); i++) {
            sb.append(mechanicsList.get(i).getName());
            sb.append(" ");
            sb.append(mechanicsList.get(i).getSurName());
            if(i!=mechanicsList.size()-1){
                sb.append(", ");
            }
        }
        return sb;
    }
    //endregion

    public Driver getDriver() {
        return this.driver;
    }


    abstract void startMove();

    abstract void finish();

    abstract void printType();

    public abstract void passDiagnostic();


}
