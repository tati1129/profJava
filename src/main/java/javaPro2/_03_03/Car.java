package javaPro2._03_03;

public class Car {
    private String model;
    private int year;
    private int mileage;

    private  int fuelAmount;
    private  int fuelUsage;

    public Car(String model, int year, int mileage, int fuelAmount, int fuelUsage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelAmount = fuelAmount;
        this.fuelUsage = fuelUsage;
    }

    public Car(String model, int year, int mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String present(){
        return  model+ " " + year + " " + mileage + " year of mileage ";
    }
    public void drive(int amountOfKilometres){
        mileage += amountOfKilometres;
        spendFuel(amountOfKilometres);
        System.out.println("wrooom");
    }
    public void spendFuel(int amountOfKilometres){
        this.fuelAmount -= (amountOfKilometres * fuelUsage);
    }
}
