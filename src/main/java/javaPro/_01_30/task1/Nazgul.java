package javaPro._01_30.task1;

public class Nazgul extends Hero{

    private int addDamage;
    public Nazgul(String name, int health, int power, int protection,int addDamage) {
        super(name, health, power, protection);
        setAddDamage(addDamage);
    }

    @Override
    protected void takeDamage(int damage, Hero enemy) {
        super.takeDamage(damage, enemy);
        enemy.takeDamage(addDamage, this);

    }

    private void setAddDamage(int addDamage) {
        this.addDamage = addDamage;
    }
}
