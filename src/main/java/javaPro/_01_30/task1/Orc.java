package javaPro._01_30.task1;

public class Orc extends  Hero{

    private final int healthMax;

    @Override
    public int getPower() {
        double powerMultiplier = (1 - (double) getHealth() / healthMax) + 1;
        return (int) ( super.getPower() * powerMultiplier);
    }

    public Orc(String name, int health, int power, int protection) {
        super(name, health, power, protection);
        healthMax = health;
    }
}
