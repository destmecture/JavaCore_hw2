package drivers;

import static utilities.ValidationUtilities.*;
public abstract class Driver {
    private String name;
    private boolean hasDriverLicence;
    private int driverExperience;

    public Driver(String name, boolean hasDriverLicence, int driverExperience) {
        this.name = checkStringValidation(name);
        this.hasDriverLicence = checkDriverLicense(hasDriverLicence);
        this.driverExperience =  checkIntValidation(driverExperience);
    }

    //region getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkStringValidation(name);
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = checkDriverLicense(hasDriverLicence);
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = checkIntValidation(driverExperience);
    }

    //endregion

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void fillTank();

}
