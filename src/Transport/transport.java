package Transport;

//        - Марка
//        - Модель
//        - Год выпуска
//        - Страна производства
//        - Цвет кузова
//        - Максимальная скорость передвижения
public class transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    public transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;}
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        }
    }
}
