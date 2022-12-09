package Animal;

import java.time.LocalDate;

public abstract class animal {
    private String name;
    private final int yearBirth;

    public animal(String name, int age) {
        setName(name);
        if (age >= 0) {
            this.yearBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearBirth = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "some kind of animal";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearBirth;
    }

}
