package practice._2025_01_23.task2;

public class Horse extends Animal {
    private String color;
    private int age;
    private String noise = "IIIIIYA!";


    public Horse(String food, String location, String noise, String color, int age) {
        super(food, location, noise);
        this.color = color;
        this.age = age;
    }



    @Override
    public void makeNoise() {
        System.out.println("Horse male noise " + noise);
    }

    @Override
    public void eat() {
        System.out.println("Horse eating " + getFood());
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return "Horse: " +
                "color='" + color + '\'' +
                ", age=" + age +

                " , ";
    }
}
