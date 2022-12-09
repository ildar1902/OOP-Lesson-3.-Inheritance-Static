package Animal;

public class Flightless extends Bird {
    private final String movementType;
    private final String kindName;

    public Flightless(String kindName, String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (movementType != null && !movementType.isEmpty() & !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "Информация не указана";
        }

        if (kindName != null && !kindName.isEmpty() && !kindName.isBlank()) {
            this.kindName = kindName;
        } else {
            this.kindName = "Информация не указана";
        }
    }

    public void walk() {
        System.out.println(getKindName() + " " + getName() + " " + "прогуливается");
    }

    @Override
    public void hunt() {
        System.out.println(getKindName() + " " + getName() + " выходит на охоту");
    }

    @Override
    public void eat() {
        System.out.println(getKindName() + " " + getName() + " идёт кушать");
        System.out.println(getKindName() + " " + getName() + " кушает ");
    }

    @Override
    public void sleep() {
        System.out.println(getKindName() + " " + getName() + " спит...");
    }

    @Override
    public void move() {
        System.out.println(getKindName() + " " + getName() + " перемещается");
    }

    public String getMovementType() {
        return movementType;
    }

    public String getKindName() {
        return kindName;
    }
    public static void checkUniqueness(Flightless animal1,
                                       Flightless animal2,
                                       Flightless animal3) {
        if (!animal1.equals(animal2) && !animal1.equals(animal3)
                && !animal2.equals(animal3)) {
            System.out.println("Все животные в классе нелетающие птицы уникальны!");
        } else {
            System.out.println("Есть похожие животные!");
        }
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n")
                + "Возраст: " + getAge() + ", место обитания: "
                + getLivingEnvironment() + ", способ передвижения: " + getMovementType();
    }

}
