package practice._2025_01_23.task2;

public abstract class Animal {
    private String food;
    private String location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;

    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }


    public void eat(){
        System.out.println("Такое-то животное ест " + food);
    };
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    abstract public void makeNoise();

}
