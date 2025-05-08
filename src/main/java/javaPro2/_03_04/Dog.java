package javaPro2._03_04;

public class Dog extends Animal{
    private String breed;


    public Dog(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
