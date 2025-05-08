package javaPro2._03_04;

public abstract class Aircraft {
    private int fuelTank;
    private int fuelUsage;

    public Aircraft(int fuelTank, int fuelUsage) {
        this.fuelTank = fuelTank;
        this.fuelUsage = fuelUsage;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }
}
