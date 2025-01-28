package practice._01_24;

public abstract class Animated extends Creature{
    private int age;

    public Animated(String name, int age) {
        super(name);
        this.age = age;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void  grow(){
        System.out.println(getName() + " grows from " + age + " to " + ++age);
    }
}
