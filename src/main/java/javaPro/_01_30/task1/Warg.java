package javaPro._01_30.task1;

public class Warg extends Hero {

    private final int healthMax;
    private int healthAmount;


    public Warg(String name, int health, int power, int protection, int healthAmount) {
        super(name, health, power, protection);
        healthMax = health;
        this.healthAmount = healthAmount;
//        setHealthAmount(healthAmount);
    }

    @Override
    public void attack(Hero enemy) {
        heal();
        super.attack(enemy);
    }

    private void heal() {
        setHealth(getHealth() + healthAmount);
        if (getHealth() > healthMax) {
            setHealth(healthMax);
        }
        System.out.printf("%s healted to %d health points.%n", getName(), getHealth());
    }

    public void setHealthAmount(int healthAmount) {
        this.healthAmount = healthAmount;
    }
}
