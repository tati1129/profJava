package summary._01_23.task2;

public class Cat extends Animal{
    private String breed;
    private String color;
    private String noise = "Meow";

    public Cat(String food, String location, String noise, String color, String breed) {
        super(food, location);
        this.color = color;
        this.breed = breed;
        this.noise = noise;

    }



    @Override
    public void makeNoise() {
        System.out.println("Cat make noise " + noise);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat isn't sleep");
    }
    @Override
    public String toString() {
        return "Cat (Breed: " + breed + ", Color: " + color + ") ";
    }
}
