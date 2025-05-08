package javaPro2._03_04;

public class Plane extends Aircraft implements Flyable{

    public Plane(int fuelTank, int fuelUsage) {
        super(fuelTank, fuelUsage);
    }

    @Override
    public String fly() {
        return "I'm flying je engine";
    }
}
