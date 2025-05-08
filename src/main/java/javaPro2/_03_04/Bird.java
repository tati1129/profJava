package javaPro2._03_04;

public class Bird implements Flyable{
    private String name;
    private int speed;

    public Bird(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return speed;
    }

    public void setAge(int speed) {
        this.speed = speed;
    }

    @Override
    public String fly() {
        return "I'm a bird " + name + "!";
    }
}
