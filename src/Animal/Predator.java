package Animal;

public class Predator extends Mammal {
    private final String typeOfFood;
    private final String kindName;

    public Predator(String kindName, String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "Информация не указана";
        }
        if (kindName != null && !kindName.isEmpty() && !kindName.isBlank()) {
            this.kindName = kindName;
        } else {
            this.kindName = "Информация не указана";
        }
    }

    public void prey() {
        System.out.println(getKindName() + " " + getName() + " выходит на охоту");
    }

    @Override
    public void walk() {
        System.out.println(getKindName() + " " + getName() + " " + "прогуливается");
    }

    @Override
    public void eat() {
        System.out.println(getKindName() + " " + getName() + " " + " ест " + getTypeOfFood());
    }

    @Override
    public void sleep() {
        System.out.println(getKindName() + " " + getName() + " " + " спит");
    }

    @Override
    public void move() {
        System.out.println(getKindName() + " " + getName() + " " + " передвигается");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    public String getKindName() {
        return kindName;
    }

    public static void checkUniqueness(Predator animal1, Predator animal2, Predator animal3) {
        if (!animal1.equals(animal2) && !animal1.equals(animal3)
                && !animal2.equals(animal3)) {
            System.out.println("Все животные в этом классе хищников уникальны!");
        } else {
            System.out.println("Есть похожие животные!");
        }
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n") + "Возраст: " + getAge()
                + ", место обитания: " + getLivingEnvironment() + ", скорость передвижения: " + getTravelSpeed() +
                "км/ч, тип пищи: " + typeOfFood
                + ", принадлежит классу: " + getClass();
    }
}
