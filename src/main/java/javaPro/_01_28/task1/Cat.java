package javaPro._01_28.task1;

public class Cat {
    private  String name;

    public Cat(String name) {
        this.name = name;
    }

    public void play(Dog dog){
        System.out.println("didn't like each other");
    }

    public void play(Human human){
        System.out.println(name + " play with" + human.getName() );
    }
    public void play(Robot robot){
        System.out.println(name + " play with" + robot.getName() );
    }
}
