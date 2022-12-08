import Transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("       ООП. Урок 3. Наследование");
        System.out.println();
        System.out.println("    ДЗ");
        Car ladaGranta = new Car(
                "Лада",
                "Гранта",
                1.7,
                "жёлтый",
                2015,
                "Россия",
                "МКПП",
                "седан",
                "а001аа102",
                5);
        System.out.println(ladaGranta);
        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                "Германия",
                "АКПП",
                "седан",
                "а002аа102",
                4);
        System.out.println(audiA8);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                "МКПП",
                "хэтчбек",
                "а003аа102",
                4);
        System.out.println(bmw);
        Car kiaSportage = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "АКПП",
                "кроссовер",
                "а004аа102",
                6);
        System.out.println(kiaSportage);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "МКПП",
                "седан",
                "а005аа102",
                5);
        System.out.println(hyundai);
        System.out.println();
//        Car.Key bmwKey = new Car.Key(true, false);
//        System.out.println(bmwKey);
        Car.Insurance grantaInsurance = ladaGranta.new Insurance(
                2023,
                9890,
                "ААА000001");
        System.out.println("Лада Гранта: " + grantaInsurance);
        Car.Insurance audiInsurance = audiA8.new Insurance(
                2022,
                12890,
                "ААА000002");
        System.out.println("Ауди: " + audiInsurance);
        Car.Insurance bmwInsurance = bmw.new Insurance(
                2021,
                11990,
                "ААА000003");
        System.out.println("БМВ: " + bmwInsurance);
        Car.Insurance kiaInsurance = kiaSportage.new Insurance(
                2024,
                9000,
                "ААА000004");
        System.out.println("Киа: " + kiaInsurance);
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(
                2022,
                10890,
                "ААА000005");
        System.out.println("Хёндай: " + hyundaiInsurance);

    }
}