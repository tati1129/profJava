package practice._2025_01_23.task2;

public class Dog extends Animal{
    private String breed;
    private double weight;
    private String noise = "Gav-gav";

    public Dog(String food, String location, String breed, String noise, double weight) {
        super(food, location);
        this.breed = breed;
        this.weight = weight;
        this.noise = noise;

    }


    @Override
    public void eat() {
        System.out.println("Dog eat " + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog make noise" + noise);
    }

    @Override
    public String toString() {
        return "Dog: " +
                "weight=" + weight +
                ", breed='" + breed + '\'' +
                " , ";
    }
}
