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
    private String colorBody;
    private double maxSpeed;

    public transport(String brand, String model, int year, String country) {
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

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        if (colorBody == null || colorBody.isEmpty()) {
            this.colorBody = "белый";
        } else {
            this.colorBody = colorBody;}
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
