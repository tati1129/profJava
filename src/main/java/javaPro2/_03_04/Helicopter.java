package javaPro2._03_04;

public class Helicopter extends Aircraft implements Flyable{

    private String model;
    private int speed;

    public Helicopter(int fuelTank, int fuelUsage, String model, int speed) {
        super(fuelTank, fuelUsage);
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String fly() {
        return "I'm a Helicopter " + getModel() + "!";
    }
}
