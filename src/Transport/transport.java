package Transport;

public abstract class transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;
    private double fuelPercentage;
    public final double fullTank;

    public transport(String brand, String model, int year, String country, String color,
                     double maxSpeed, double fuelPercentage) {
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
        setFuelPercentage(fuelPercentage);
        fullTank = 100.00;
    }

    public abstract void refill();

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

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    protected void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage <=0 || fuelPercentage > 100) {
            this.fuelPercentage = 2;
        } else{
            this.fuelPercentage = fuelPercentage;
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        }
    }
}
