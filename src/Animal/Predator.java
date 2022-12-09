package Animal;

public class Predator extends Mammal{
    private String typeOfFood;
    private String kindName;

    public Predator(String kindName, String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
        if (kindName != null && !kindName.isEmpty() && !kindName.isBlank()) {
            this.kindName = kindName;
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

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getKindName() {
        return kindName;
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n") + "Возраст: " + getAge()
                + ", место обитания " + getLivingEnvironment() + ", скорость передвижения: " + getTravelSpeed() +
                "км/ч, тип пищи: " + typeOfFood;
    }
}
