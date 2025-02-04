package javaPro._01_30.task1;

import java.util.Random;

public class Elf extends Hero {

    private static final Random RANDOM = new Random();

    private int changeToDodge;

    public Elf(String name, int health, int power, int protection, int changeToDodge) {
        super(name, health, power, protection);
        setChangeToDodge(changeToDodge);
    }

    @Override
    public String toString() {
        return String.format("Elf %s has %d health.",getName(),getHealth());
    }

    @Override
    public void takeDamage(int damage, Hero enemy) {
        if (changeToDodge > RANDOM.nextInt(101)){
            System.out.printf("%s has dodged.%n",enemy.getName());
            return;
    }
        super.takeDamage(damage,enemy);
    }

    private void setChangeToDodge(int changeToDodge) {
        if (changeToDodge > 0 && changeToDodge <= 100) {
            this.changeToDodge = changeToDodge;
        } else {
            throw new IllegalArgumentException("Change t dodge damage is invalid.");
        }
    }
}
