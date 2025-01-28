package javaPro._01_28.task3;

import java.util.Random;

public class Human extends Hero {

    private static final Random RANDOM = new Random();

    private double damageMultiploer;

    private int changeOfCriticalDamage;

    public Human(String name, int health, int power, int protection, double damageMultiploer, int damageCriticalDamage) {
        super(name, health, power, protection);
        setDamageMultiploer(damageMultiploer);
        setChangeOfCriticalDamage(damageCriticalDamage);
    }


    @Override
    public String toString() {
        return String.format("Human %s has %d health.", getName(), getHealth());
    }

    @Override
    public void attack(Hero enemy) {
        int damage;
        if (changeOfCriticalDamage > RANDOM.nextInt(101)) {
            damage = (int) (getPower() * damageMultiploer / enemy.getProtection());
            enemy.takeDamage(damage, getName());
            System.out.printf("%s attacks %s for %d  damage", getName(), enemy.getName(), damage);
        } else super.attack(enemy);
    }

    private void setDamageMultiploer(double damageMultiploer) {
        if (damageMultiploer > 1 && damageMultiploer <= 5) {
            this.damageMultiploer = damageMultiploer;
            return;
        } else {
            throw new IllegalArgumentException("Value of damage multiplier is invalid");
        }
    }

    private void setChangeOfCriticalDamage(int changeOfCriticalDamage) {
        if (changeOfCriticalDamage > 0  && changeOfCriticalDamage <= 100){
            this.changeOfCriticalDamage = changeOfCriticalDamage;
        } else {
            throw new IllegalArgumentException("Value of critical damage is invalid.");
        }
    }
}
