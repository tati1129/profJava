package summary._01_24;

public class Robot extends Creature implements AnimalWallkers, MouseCatcher {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! My name is " + getName());
    }

    @Override
    public void walkAnimal(Animal animal) {
        System.out.println(getName() + " walking with animal " + animal.getName());
        animal.setHungry(true);
    }
    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println(getName() + " catch mouse " + mouse.getName());
    }
}
