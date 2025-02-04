package javaPro._01_30.task1;


import javaPro._01_30.exceptions.InvalidLengthException;

import java.util.Random;

public class Human extends Hero {

    private static final Random RANDOM = new Random();

    private double damageMultiploer;

    private int changeOfCriticalDamage;

    public Human(String name, int health, int power, int protection, double damageMultiploer, int damageCriticalDamage) {
        super(name, health, power, protection);
        setDamageMultiplier(damageMultiploer);
        setChangeOfCriticalDamage(damageCriticalDamage);
    }

    @Override
    protected void setHealth(int health) {
        if (health >= 100 && health <= 130) {
            super.setHealth(health);
        } else {
            throw new InvalidLengthException("Human cannot have " +  health + "Human health should be between 100 and 130");
        }
    }

    @Override
    public String toString() {
        return String.format("Human %s has %d health.%n", getName(), getHealth());
    }

    @Override
    public void attack(Hero enemy) {
        int damage;
        if (changeOfCriticalDamage > RANDOM.nextInt(101)) {
            damage = (int) (getPower() * damageMultiploer / enemy.getProtection());
            enemy.takeDamage(damage, this);
            System.out.printf("%s attacks %s for %d  damage%n", getName(), enemy.getName(), damage);
        } else super.attack(enemy);
    }

    private void setDamageMultiplier(double damageMultiploer) {
        if (damageMultiploer > 1.0 && damageMultiploer <= 5) {
            this.damageMultiploer = damageMultiploer;
            return;
        } else {
            throw new IllegalArgumentException("Value of damage multiplier is invalid.%n");
        }
    }

    private void setChangeOfCriticalDamage(int changeOfCriticalDamage) {
        if (changeOfCriticalDamage > 0 && changeOfCriticalDamage <= 100) {
            this.changeOfCriticalDamage = changeOfCriticalDamage;
        } else {
            throw new IllegalArgumentException("Value of critical damage is invalid.%n");
        }
    }
}
