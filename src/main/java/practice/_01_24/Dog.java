package practice._01_24;

public class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Gav -gav-GAV!");
    }
    @Override
    public void sayHello() {
        System.out.println("Bark! I'm a doog of " + breed + " breed. My name is " + getName());
    }

    @Override
    public void playing(Creature another) {
        if (another instanceof Cat) {
//
            System.out.println("Cat " + another.getName() + " runs away!  Dog " + getName() + " barks!");
        } else {
            super.playing(another);
        }
    }
}
