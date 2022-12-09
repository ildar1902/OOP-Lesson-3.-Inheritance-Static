package Transport;

import java.time.LocalDate;

public class Car extends transport {

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private final int validityPeriod;
        private final double cost;
        private final String serialNumberInsurance;

        public Insurance(int validityPeriod, double cost, String serialNumberInsurance) {
            this.validityPeriod = validityPeriod;
            if (validityPeriod < LocalDate.now().getYear()) {
                System.out.println("У автомобиля " + getBrand() + " " + getModel() + " "
                        + " срок действия страховки истёк, нужно срочно оформить новую страховку!");
            }
            this.cost = cost;
            if (cost <= 0) {
                cost = 10_000;
            }
            this.serialNumberInsurance = serialNumberInsurance;
            if (serialNumberInsurance == null || serialNumberInsurance.length() != 9) {
                System.out.println("Номер страховки некоректный!");
            }
        }

        public int getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getSerialNumberInsurance() {
            return serialNumberInsurance;
        }

        @Override
        public String toString() {
            return "Срок действия страховки: " + getValidityPeriod() +
                    ", стоимость страховки = " + getCost() + " руб" +
                    ", номер страховки: " + getSerialNumberInsurance();
        }
    }


    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String serialNumber;
    private final int numberSeats;
    private boolean summerTyres;
    private String typeOfFuel;

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country,
               String transmission, String bodyType,
               String serialNumber, int numberSeats, double maxSpeed, double fuelPercentage, String typeOfFuel) {

        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = bodyType;
        if (bodyType == null || bodyType.isEmpty())
            bodyType = "седан";
        setSerialNumber(serialNumber);
        this.numberSeats = numberSeats;
        if (numberSeats <= 0) {
            numberSeats = 5;
        }
        setSummerTyres(summerTyres);
setTypeOfFuel(typeOfFuel);
    }

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country,
               String transmission, String bodyType,
               String serialNumber, int numberSeats, double maxSpeed) {
        this(brand, model, engineVolume, color, year, country, transmission, bodyType,
                serialNumber, numberSeats, maxSpeed, 0,"");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.isEmpty()) {
            this.serialNumber = "х000хх000";
        } else {
            this.serialNumber = serialNumber;
        }
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

   public void setTypeOfFuel(String typeOfFuel) {
       if (typeOfFuel!= null && !typeOfFuel.isEmpty()
               && !typeOfFuel.isBlank() &&( typeOfFuel.equals("дизель") ||typeOfFuel.equals("электроэнергия") )) {
           this.typeOfFuel = typeOfFuel;
       } else {
           this.typeOfFuel = "бензин";
       }
   }


    public void changeTyres() {
        setSummerTyres(!summerTyres);
    }
    public boolean isValidNumber() {
        return serialNumber.length() == 9

                && Character.isLetter(serialNumber.charAt(0))
                && Character.isLetter(serialNumber.charAt(4))
                && Character.isLetter(serialNumber.charAt(5))

                && Character.isDigit(serialNumber.charAt(1))
                && Character.isDigit(serialNumber.charAt(2))
                && Character.isDigit(serialNumber.charAt(3))
                && Character.isDigit(serialNumber.charAt(6))
                && Character.isDigit(serialNumber.charAt(7))
                && Character.isDigit(serialNumber.charAt(8));
    }

    @Override
    public void refill() {
        if (getFuelPercentage() < fullTank && typeOfFuel.equals("бензин") || typeOfFuel.equals("дизель")) {
            System.out.println("Уровень топлива = " + getFuelPercentage() + "%");
            System.out.println("Едем на " + getBrand() + " на АЗС, где заправляют " + typeOfFuel);
            System.out.println("Заправляем " + typeOfFuel);
            setFuelPercentage(fullTank);
            System.out.println("Готово! Теперь уровень топлива = " + getFuelPercentage() + "%!");
        } else if (getFuelPercentage() < fullTank && typeOfFuel.equals("электроэнергия")) {
            System.out.println("Уровень заряда = " + getFuelPercentage() + "%");
            System.out.println("Едем на " + getBrand() + " на специальную электропарковку.");
            System.out.println("Заряжаем электрокар");
            setFuelPercentage(fullTank);
            System.out.println("Готово! Теперь уровень заряда = " + getFuelPercentage() + "%!");
        }
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + getColor() +
                ", год производства: " + getYear() +
                ", страна сборки: " + getCountry() +
                ", КПП: " + transmission +
                ", кузов: " + bodyType +
                ", регистрационный номер: " + serialNumber +
                ", количество мет: " + numberSeats +
                ", максимальная скорость: " + getMaxSpeed();
    }
}
