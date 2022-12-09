package Animal;

public class Herbivore extends Mammal {
    private String typeOfFood;
    private String kindName;

    public Herbivore( String kindName, String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
        if (kindName != null && !kindName.isEmpty() && !kindName.isBlank()) {
            this.kindName = kindName;
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
    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n") + "Возраст: " + getAge()
                + ", место обитания " + getLivingEnvironment() + ", скорость передвижения: " + getTravelSpeed() +
                "км/ч, тип пищи: " + typeOfFood;

    }
}
