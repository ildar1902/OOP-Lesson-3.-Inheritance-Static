package Animal;
public class Herbivore extends Mammal {
    private final String typeOfFood;
    private final String kindName;

    public Herbivore(String kindName, String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
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

    public void graze() {
        System.out.println(getName() + " пасётся");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " идёт кушать");
        System.out.println(getName() + " кушает " + getTypeOfFood());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит...");
    }

    @Override
    public void move() {
        System.out.println(getName() + " перемещается");
    }

    public String getKindName() {
        return kindName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
    public static void checkUniqueness(Herbivore herbivore, Herbivore otherHerbivore, Herbivore thirdHerbivore) {
        if (!herbivore.equals(otherHerbivore) && !herbivore.equals(thirdHerbivore)
                && !otherHerbivore.equals(thirdHerbivore)) {
            System.out.println("Все животные в классе травоядных уникальны!");
        } else {
            System.out.println("Есть похожие животные!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Herbivore herbivore = (Herbivore) o;

        if (!typeOfFood.equals(herbivore.typeOfFood)) return false;
        return kindName.equals(herbivore.kindName);
    }

    @Override
    public int hashCode() {
        int result = typeOfFood.hashCode();
        result = 31 * result + kindName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n") + "Возраст: " + getAge()
                + ", место обитания: " + getLivingEnvironment() + ", скорость передвижения: " + getTravelSpeed() +
                "км/ч, тип пищи: " + typeOfFood;

    }
}
