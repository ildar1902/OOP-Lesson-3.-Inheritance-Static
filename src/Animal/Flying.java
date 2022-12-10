package Animal;

public class Flying extends Bird {
    private final String movementType;
    private final String kindName;

    public Flying(String kindName, String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        if (StringUtils.isNotEmpty(movementType)) {
            this.movementType = movementType;
        } else {
            this.movementType = "Информация не указана";
        }

        if (StringUtils.isNotEmpty(kindName)) {
            this.kindName = kindName;
        } else {
            this.kindName = "Информация не указана";
        }
    }

    public void fly() {
        System.out.println(getKindName() + " " + getName() + " летает");
    }

    @Override
    public void hunt() {
        System.out.println(getKindName() + " " + getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println(getKindName() + " " + getName() + " ест");
    }

    @Override
    public void sleep() {
        System.out.println(getKindName() + " " + getName() + " спит");
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
    public static void checkUniqueness(Flying animal1,
                                       Flying animal2,
                                       Flying animal3) {
        if (!animal1.equals(animal2) && !animal1.equals(animal3)
                && !animal2.equals(animal3)) {
            System.out.println("Все птички в классе летающие птицы уникальны!");
        } else {
            System.out.println("Есть похожие птицы!");
        }
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n")
                + "Возраст: " + getAge() + ", место обитания: "
                + getLivingEnvironment() + ", способ передвижения: " + getMovementType()
                + ", принадлежит классу: " + getClass();
    }
}
