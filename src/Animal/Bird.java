package Animal;

public abstract class Bird extends animal {
    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }
    public abstract void hunt();

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
}
