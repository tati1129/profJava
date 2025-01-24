package practice._2025_01_23.task2;

public abstract class Animal {
    private String food;
    private String location;
    private String noise;

    public Animal(String food, String location, String noise) {
        this.food = food;
        this.location = location;
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println("Такое-то животное издаёт звук " + noise);
    }
    public void eat(){
        System.out.println("Такое-то животное ест " + food);
    };
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public abstract String toString();
}
