package homeworks._20_05.pizza;

public class Pizza {
    private double diametr;
    private double caloriesInSm;

    public Pizza(double diametr, double caloriesInSm) {
        this.diametr = diametr;
        this.caloriesInSm = caloriesInSm;
    }

    public double getDiametr() {
        return diametr;
    }

    public double getCaloriesInSm() {
        return caloriesInSm;
    }
}
