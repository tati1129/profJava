package summary._01_24;

public class Mouse extends Animal {
    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
    System.out.println(" Pee - pee! I'm mouse! My name is " + getName());
    }


}
