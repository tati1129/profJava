package practice._01_24;

public class Human extends Animated  implements AnimalWallkers{
    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi! I'm human, my name is " + getName());
    }

    public void feed(Animal... animals) {
        for (Animal animal : animals) {

        }
    }

    public void feed(Animal animal) {
        animal.eat();
    }
    @Override
    public void walkAnimal(Animal animal) {
        System.out.println(getName() + " walking with animal " + animal.getName());
        animal.setHungry(true);
    }
}
