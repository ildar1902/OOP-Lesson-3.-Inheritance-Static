package Animal;

public class Amphibian extends animal {
    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }
    public void hunt() {
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    protected void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Не указаны данные";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}


