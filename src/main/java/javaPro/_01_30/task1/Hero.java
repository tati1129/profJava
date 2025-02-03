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

    public int getProtection() {
        return protection;
    }

    public String getName() {
        return name;
    }

    public void attack(Hero enemy){
        int damage = power/enemy.getProtection();
        enemy.takeDamage(damage, name);
        System.out.printf("%s attacks %s for %d  damage",name, enemy.getName(),damage);
    }

    public void takeDamage(int damage, String nameOfEnemy){
        health -= damage;
        System.out.printf("%s takes %d damage from %s.", name, damage, nameOfEnemy);
        if (health <= 0){
            System.out.printf("%s dies", name);
        }else {
            System.out.printf("%s remains %d", name, health);
        }
        }
    }

