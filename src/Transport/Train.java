package Transport;

public class Train extends transport {
    private double priceOfTrip;
    private String travelTime;
    private String departureStationName;
    private String finalStop;
    private int numberWagons;
    private String typeOfFuel;

    public Train(String brand, String model, int year, String country, String color,
                 double maxSpeed, double priceOfTrip,
                 String travelTime, String departureStationName, String finalStop,
                 int numberWagons, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setDepartureStationName(departureStationName);
        setFinalStop(finalStop);
        setNumberWagons(numberWagons);
        setTypeOfFuel(typeOfFuel);
    }
    public Train(String brand, String model, int year, String country, String color,
                 double maxSpeed, double priceOfTrip,
                 String travelTime, String departureStationName, String finalStop, int numberWagons) {
       this (brand, model, year, country, color, maxSpeed, priceOfTrip, travelTime, departureStationName, finalStop,
               numberWagons, 0,"");
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setDepartureStationName(departureStationName);
        setFinalStop(finalStop);
        setNumberWagons(numberWagons);
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip <= 0) {
            this.priceOfTrip = 2300;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime == null || travelTime.isEmpty()) {
            this.travelTime = "Информация не указана";
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName.isEmpty()) {
            this.departureStationName = "Информация не указана";
        }
        this.departureStationName = departureStationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isEmpty()) {
            this.finalStop = "Нет информации";
        } else {
            this.finalStop = finalStop;
        }
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons <= 0) {
            this.numberWagons = 1;
        } else {
            this.numberWagons = numberWagons;
        }
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel != null && !typeOfFuel.isEmpty()
                && !typeOfFuel.isBlank() && typeOfFuel.equals("дизель")) {
            this.typeOfFuel = typeOfFuel;
        } else {
            this.typeOfFuel = "дизель";
        }
    }

    @Override
    public String toString() {
        return "Поезд: " + getBrand() + ", модель: " + getModel() + ", "
                + getYear() + "-го года выпуска " + ", страна производитель: " +
                getCountry() + ", скорость передвижения = " + String.format("%.0f", getMaxSpeed()) +
               " км/ч" + ", цена поездки: " + priceOfTrip + " руб." +
                ", время поездки: " + travelTime +
                ", отходит от станции " + departureStationName +
                " и следует до станции " + finalStop +
                ", в поезде " + numberWagons + " вагонов.";

    }

    @Override
    public void refill() {
        if (getFuelPercentage() < fullTank) {
            System.out.println("Уровень топлива у поезда " + getBrand() + " " + getModel() +  " = " + getFuelPercentage() + "%");
            System.out.println("Заправляем в " + getBrand() + " " + getModel() + " " + typeOfFuel);
            setFuelPercentage(fullTank);
            System.out.println("Готово! Теперь уровень топлива = " + getFuelPercentage() + "%!");
        }

    }
}
