package Animal;

public abstract class Mammal extends Animal {
    private String livingEnvironment;
    private int travelSpeed;

    public Mammal(String name, int age, String livingEnvironment, int travelSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setTravelSpeed(travelSpeed);
    }

    public abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    protected void setLivingEnvironment(String livingEnvironment) {
        if (StringUtils.isNullOrEmpty(livingEnvironment)) {
            this.livingEnvironment = "Не указаны данные";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    protected void setTravelSpeed(int travelSpeed) {
        if (travelSpeed < 0) {
            this.travelSpeed = Math.abs(travelSpeed);
        } else {
            this.travelSpeed = travelSpeed;
        }
    }
}
