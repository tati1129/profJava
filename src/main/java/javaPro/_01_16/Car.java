package javaPro._01_16;

public class Car {
    private String brand;
    String model;
    private int age;
    static int count;
    boolean moving;

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        setAge(age);
        count++;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        if (age<1999){
            System.out.println("Error! age > 25 years");
        }else {
            this.age = age;
        }
    }
}
