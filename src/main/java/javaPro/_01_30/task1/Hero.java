package javaPro._01_30.task1;

public class Hero {
    private String name;
    private int health;
    private int power;
    private int protection;

    public Hero(String name, int health, int power, int protection) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.protection = protection;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getProtection() {
        return protection;
    }

    public String getName() {
        return name;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public void attack(Hero enemy) {
        int damage = getPower() / enemy.getProtection();
        enemy.takeDamage(damage, this);
        System.out.printf("%s attacks %s for %d  damage%n", name, enemy.getName(), damage);
    }

    protected void takeDamage(int damage, Hero enemy) {
        health -= damage;
        System.out.printf("%s takes %d damage from %s.%n", name, damage, enemy.getName());
        if (health <= 0) {
            System.out.printf("%s dies%n", name);
        } else {
            System.out.printf("%s remains %d%n", name, health);
        }
    }


}

