package Transport;

public class Bus extends transport{
    private String typeOfFuel;


    public Bus(String brand, String model, int year, String country,
               String color, double maxSpeed, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        this.typeOfFuel = typeOfFuel;
    }
    public Bus(String brand, String model, int year, String country,
               String color, double maxSpeed, double fuelPercentage) {
        this(brand, model, year, country, color, maxSpeed, fuelPercentage,null);
    }

    @Override
    public void refill() {

    }
    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", год выпуска " + getYear() +
                ", страна-производитель " + getCountry() + ", цвет " + getColor()
                + ", максимальная скорость передвижения " + String.format("%.0f", getMaxSpeed()) + " км/ч";
    }
}
