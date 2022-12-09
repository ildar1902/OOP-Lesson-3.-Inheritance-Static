package Animal;

public class Amphibian extends animal {
    private String livingEnvironment;
    private final String kindName;

       public Amphibian(String kindName, String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
           if (kindName != null && !kindName.isEmpty() && !kindName.isBlank()) {
               this.kindName = kindName;
           } else {
               this.kindName = "Информация не указана";
           }
    }
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
        System.out.println(getKindName() + " " + getName() + " двигается");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public String getKindName() {
        return kindName;
    }
    protected void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не указаны данные";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public static void checkUniqueness(Amphibian animal1,
                                       Amphibian animal2) {
        if (!animal1.equals(animal2)) {
            System.out.println("Все животные в классе земноводных уникальны!");
        } else {
            System.out.println("Есть похожие животные!");
        }
    }

    @Override
    public String toString() {
        return "    " + getKindName() + " по кличке " + getName() + ":" + String.format("%n") + "Возраст: " + getAge()
                + ", место обитания: " + getLivingEnvironment()
                + ", принадлежит классу: " + getClass();
    }
}


