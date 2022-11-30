package HomeWork_1.transport;

public enum VehicleCategory {
    SEDANE("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купэ"),
    STATION_WAGON("Универсал"),
    OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),

    N1("Масса до 3.5 тонн"),
    N2("C полной массой свыше 3,5 до 12 тонн"),
    N3("C полной массой свыше 12 тонн"),

    EXTRA_SMALL("особо малая (до 10 мест)"),
    SMALL("малая (до 25)"),
    MEDIUM("средняя (40–50)"),
    LARGE("большая (60–80)"),
    EXTRA_LARGE("особо большая (100–120 мест)"),

    DATA_MISSING("Данные не определены");

    String categoryName;

    VehicleCategory(String categoryName) {
        this.categoryName = categoryName;
    }

}
