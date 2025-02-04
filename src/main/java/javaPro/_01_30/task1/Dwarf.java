package javaPro._01_30.task1;

public class Dwarf extends Hero{

    private double armourMultiplier;

    public Dwarf(String name, int health, int power, int protection, double armourMultiplier) {
        super(name, health, power, protection);
        setArmourMultiplier(armourMultiplier);
    }

    @Override
    public int getProtection() {
        return (int)(super.getProtection() * armourMultiplier);
    }

    public  void  setArmourMultiplier(double armourMultiplier){
        if (armourMultiplier > 1.0 && armourMultiplier <= 5){
            this.armourMultiplier = armourMultiplier;
        }else {
            throw new IllegalArgumentException("Armor multiplier is invalid.");
        }
    }
}
