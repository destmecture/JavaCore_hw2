package utilities;

public class ValidationUtilities {
    public static String checkStringValidation(String input) {
        if (input == null||input.isBlank()) {
            return "default";
        } else {
            return input.toUpperCase();
        }
    }

    public static int checkIntValidation(int input) {
        if (input <= 0) {
            return 1;
        } else {
            return input;
        }
    }

    public static boolean checkDriverLicense(boolean input) {
        if (input) {
            return input;
        } else {
            throw new RuntimeException("Водитель не имеет прав на управление ТС");
        }
    }
    public static double checkDoubleValidation(double input) {
        if (input <= 0.0) {
            return 1.0;
        } else {
            return input;
        }
    }

}
