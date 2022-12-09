package Transport;

public class Bus extends transport{
    private String typeOfFuel;


    public Bus(String brand, String model, int year, String country,
               String color, double maxSpeed, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        setTypeOfFuel(typeOfFuel);
    }
    public Bus(String brand, String model, int year, String country,
               String color, double maxSpeed, double fuelPercentage) {
        this(brand, model, year, country, color, maxSpeed, fuelPercentage,null);
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }
    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel != null && !typeOfFuel.isEmpty()
                && !typeOfFuel.isBlank() && typeOfFuel.equals("дизель")) {
            this.typeOfFuel = typeOfFuel;
        } else {
            this.typeOfFuel = "бензин";
        }
    }
    @Override
    public void refill() {
        if (getFuelPercentage() < fullTank) {
            System.out.println("Уровень топлива = " + getFuelPercentage() + "%");
            System.out.println("Едем на " + getBrand() + " на АЗС, где заправляют " + typeOfFuel);
            System.out.println("Заправляем " + typeOfFuel);
            setFuelPercentage(fullTank);
            System.out.println("Готово! Теперь уровень топлива = " + getFuelPercentage() + "%!");
        }
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", год выпуска " + getYear() +
                ", страна-производитель " + getCountry() + ", цвет " + getColor()
                + ", максимальная скорость передвижения " + String.format("%.0f", getMaxSpeed()) + " км/ч";
    }
}
