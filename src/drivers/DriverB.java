package drivers;

public class DriverB extends Driver {


    public DriverB(String name, boolean hasDriverLicence, int driverExperience ) {
        super(name, hasDriverLicence, driverExperience);
    }


    @Override
    public void startMoving() {
        System.out.println("Driver cat.B started moving");
    }

    @Override
    public void finishMoving() {
        System.out.println("Driver cat.B finished moving");
    }

    @Override
    public void fillTank() {
        System.out.println("Driver cat.B fill the tank");
    }
}
