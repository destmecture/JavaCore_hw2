package drivers;

public class DriverC extends Driver {


    public DriverC(String name, boolean hasDriverLicence, int driverExperience ) {
        super(name, hasDriverLicence, driverExperience);

    }


    @Override
    public void startMoving() {
        System.out.println("Driver cat.C started moving");
    }

    @Override
    public void finishMoving() {
        System.out.println("Driver cat.C finished moving");
    }

    @Override
    public void fillTank() {
        System.out.println("Driver cat.C fill the tank");
    }
}