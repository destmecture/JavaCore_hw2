package Enum;

public enum CarBodyType {
    SEDAN("Седан"), Hatchback("Хэтчбек"), Coupe("Купе"),
    Wagon("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"),
    PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

    private String translation;
    CarBodyType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Тип кузова: "+getTranslation();
    }
}
