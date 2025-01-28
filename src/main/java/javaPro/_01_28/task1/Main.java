package javaPro._01_28.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Sam");
        Human human = new Human("Antony");
        Robot robot = new Robot("R2D2");

        Object[] objects = {cat, dog, human, robot};

        for (int i = 0; i < objects.length ; i++) {
            if (objects[i] instanceof Cat){
                Cat cat1 = (Cat) objects[i];
                if (objects[i+1] instanceof Dog){
                    Dog dog1 = (Dog) objects[i+1];
                    cat1.play(dog1);
                }else if (objects[i+1] instanceof Human){
                    Human human1 = (Human) objects[i+1];
                    cat1.play(human1);
                }

            }
        }
    }
}
