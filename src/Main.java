import Animal.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

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
                5,
                180,
                75.67,
                null);
        System.out.println(ladaGranta);
        ladaGranta.refill();
        System.out.println(ladaGranta.getFuelPercentage());
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
                4,
                220,
                10.34,
                "электроэнергия");
        System.out.println(audiA8);
        audiA8.refill();
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
                4,
                200);
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
                6,
                180);
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
                5,
                180);
        System.out.println(hyundai);
        System.out.println();
        Car.Key bmwKey = new Car.Key(true, false);
        System.out.println(bmwKey);
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
        System.out.println();

        Train lastochka = new Train(
                "Ласточка",
                "В-901",
                2011,
                "Россия",
                "",
                301,
                3500,
                "",
                "Белорусский вокзал",
                "Минск-пассажирский",
                11);
        System.out.println(lastochka);
        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                "",
                270,
                1700,
                "",
                "Ленинградский вокзал",
                "Станция Ленинград-пассажирский",
                8);
        System.out.println(leningrad);
        leningrad.refill();
        Bus b1 = new Bus(
                "МАЗ",
                "1034",
                2015,
                "Беларусь",
                "белый",
                110,
                56.55);
        System.out.println(b1);
        Bus b2 = new Bus(
                "ПАЗ",
                "Вектор",
                2012,
                "Россия",
                "синий",
                100,
                67.34);
        System.out.println(b2);
        Bus b3 = new Bus(
                "ЛАЗ",
                "AeroLAZ",
                2014,
                "Украина",
                "красный",
                150,
                72.15);
        System.out.println(b3);
        System.out.println("b3.getFuelPercentage() = " + b3.getFuelPercentage());
        b3.refill();
        System.out.println();

//        Здесь транспорт заканчивается
//                Начинаются животные

        System.out.println(" ДЗ 3. Иерархия классов животных");

//       МЛЕКОПИТАЮЩИЕ ТРАВОЯДНЫЕ
        System.out.println("        Млекопитающие:");
        System.out.println("    Травоядные ");
        Herbivore giraffe = new Herbivore(
                "жираф",
                "Рафф",
                3,
                "Африка",
                35,
                "растения");
        System.out.println(giraffe);
        giraffe.graze();
        giraffe.eat();
        giraffe.move();
        giraffe.walk();
        giraffe.sleep();
        System.out.println();
        Herbivore horse = new Herbivore(
                "лошадь",
                "Лошадка",
                2,
                "степь",
                30,
                "трава");
        System.out.println(horse);
        horse.graze();
        horse.eat();
        horse.move();
        horse.walk();
        horse.sleep();
        System.out.println();
        Herbivore gazelle = new Herbivore(
                "газель",
                "Гузель",
                5,
                "Африка",
                45,
                "растения");
        System.out.println(gazelle);
        gazelle.graze();
        gazelle.eat();
        gazelle.move();
        gazelle.walk();
        gazelle.sleep();
        Herbivore.checkUniqueness(horse, gazelle, giraffe);

//       МЛЕКОПИТАЮЩИЕ ХИЩНИКИ

        System.out.println();
        System.out.println("    Хищники");
        Predator hyena = new Predator(
                "гиена",
                "Олег",
                6,
                "Африка",
                50,
                "живность");
        System.out.println(hyena);
        hyena.prey();
        hyena.eat();
        hyena.walk();
        hyena.move();
        hyena.sleep();
        System.out.println();
        Predator tiger = new Predator(
                "тигр",
                "Лев",
                5,
                "заповедник",
                65,
                "мясо других животных");
        System.out.println(tiger);
        tiger.prey();
        tiger.eat();
        tiger.walk();
        tiger.move();
        tiger.sleep();
        System.out.println();
        Predator bear = new Predator(
                "медведь",
                "Мишка",
                5,
                "лес",
                47,
                "мясо");
        System.out.println(bear);
        bear.prey();
        bear.eat();
        bear.walk();
        bear.move();
        bear.sleep();
        Predator.checkUniqueness(bear,tiger,hyena);
        System.out.println();

//        ЗЕМНОВОДНЫЕ
        System.out.println("    Земноводные");
        Amphibian frog = new Amphibian(
                "лягушка",
                "Алёна",
                3,
                "болото");
        System.out.println(frog);
        frog.hunt();
        frog.eat();
        frog.move();
        frog.sleep();
        System.out.println();
        Amphibian snakeFreshwater = new Amphibian(
                "уж",
                "Евгений",
                3,
                "реки");
        System.out.println(snakeFreshwater);
        snakeFreshwater.hunt();
        snakeFreshwater.eat();
        snakeFreshwater.move();
        snakeFreshwater.sleep();
        Amphibian.checkUniqueness(frog,snakeFreshwater);
        System.out.println();

//        НЕЛЕТАЮЩИЕ ПТИЦЫ
        System.out.println("    Нелетающие птицы");
        Flightless peacock = new Flightless(
                "павлин",
                "Арсений",
                7,
                "джунгли",
                "ходьба");
        System.out.println(peacock);
        peacock.hunt();
        peacock.walk();
        peacock.eat();
        peacock.move();
        peacock.sleep();
        System.out.println();
        Flightless penguin = new Flightless(
                "пингвин",
                "Марсель",
                4,
                "Антарктида",
                "бег");
        System.out.println(penguin);
        penguin.hunt();
        penguin.walk();
        penguin.eat();
        penguin.move();
        penguin.sleep();
        System.out.println();
        Flightless dodo = new Flightless(
                "птица додо",
                "Дмитрий",
                3,
                "лес",
                "бег");
        System.out.println(dodo);
        dodo.hunt();
        dodo.walk();
        dodo.eat();
        dodo.move();
        dodo.sleep();
        Flightless.checkUniqueness(peacock,penguin,dodo);
        System.out.println();

//        ЛЕТАЮЩИЕ ПТИЦЫ
        System.out.println("    Летающие птицы");
        Flying seagull = new Flying(
                "чайка",
                "Оля",
                7,
                "водоёмы",
                "летает");
        System.out.println(seagull);
        seagull.hunt();
        seagull.fly();
        seagull.sleep();
        seagull.eat();
        seagull.move();
        System.out.println();
        Flying albatross = new Flying(
                "альбатрос",
                "Иван",
                3,
                "Антарктида",
                "летает");
        System.out.println(albatross);
        albatross.hunt();
        albatross.fly();
        albatross.sleep();
        albatross.eat();
        albatross.move();
        System.out.println();
        Flying falcon = new Flying(
                "сокол",
                "Серёга",
                5,
                "тайга",
                "летает");
        System.out.println(falcon);
        falcon.hunt();
        falcon.fly();
        falcon.sleep();
        falcon.eat();
        falcon.move();
        System.out.println();
        Flying.checkUniqueness(seagull, albatross, falcon);
        System.out.println();
        System.out.println("    Окончен урок Наследование ");

    }
}
