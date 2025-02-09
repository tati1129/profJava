package summary._01_24;

public class Cat extends Animal implements MouseCatcher {
    private  String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Meow! I'm a" + color +" cat. My name is " + getName());
    }

    @Override
    public void playing(Creature another) {
        if (another instanceof Dog) {
//            System.out.printf(String.format("Dog %s barks. Cat %s runs away%n",another.getName(),getName()));
//            System.out.printf("Dog %s barks. Cat %s runs away%n",another.getName(),getName());
            ((Dog) another).bark();
            System.out.println("Dog " + another.getName() + " barks. Cat " + getName() + "runs away!");
        } else {
            super.playing(another);
        }
    }
    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println(getName() + " catch mouse " + mouse.getName());
    }
}
