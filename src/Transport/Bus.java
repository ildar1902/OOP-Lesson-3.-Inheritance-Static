package Transport;

public class Bus extends transport{
    public Bus(String brand, String model, int year, String country, String color, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", год выпуска " + getYear() +
                ", страна-производитель " + getCountry() + ", цвет " + getColor()
                + ", максимальная скорость передвижения " + String.format("%.0f", getMaxSpeed()) + " км/ч";
    }
}
