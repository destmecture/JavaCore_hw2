package Service;

import transport.Transport;

import static utilities.ValidationUtilities.*;

public class Mechanic {
    private String name;
    private String surName;
    private String company;

    public Mechanic(String name, String surName, String company) {
        this.name = checkStringValidation(name);
        this.surName = checkStringValidation(surName);
        this.company = checkStringValidation(company);
    }

    //region getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //endregion

    public void performMaintenance(Transport transport) {
        System.out.println("Механик "+getName()+" "+getSurName()+" провел техобслуживание транспорта "
                +transport.getBrand()+" "+transport.getModel()+", класса "+transport.getClass());
    }

    public void fixCar(Transport transport) {
        System.out.println("Механик "+getName()+" "+getSurName()+" починин транспортное средство "
                +transport.getBrand()+" "+transport.getModel()+", класса "+transport.getClass());
    }
}
