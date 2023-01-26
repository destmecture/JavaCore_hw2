package drivers;

public class DriverD extends Driver {


    public DriverD(String name, boolean hasDriverLicence, int driverExperience ) {
        super(name, hasDriverLicence, driverExperience);
    }


    @Override
    public void startMoving() {
        System.out.println("Driver cat.D started moving");
    }

    @Override
    public void finishMoving() {
        System.out.println("Driver cat.D finished moving");
    }

    @Override
    public void fillTank() {
        System.out.println("Driver cat.D fill the tank");
    }
}