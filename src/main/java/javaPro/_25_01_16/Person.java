package javaPro._25_01_16;

public class Person {

    private String fullname;
    private int age;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.age = age;
        this.fullname = fullname;
    }

    public void move(){
        System.out.println("Person " + fullname + " running.");
    }

    public void talk(){
        System.out.println("Person " + fullname + " age " + age + " speaking");
    }

    public static void main(String[] args) {

        Person person1 = new Person("Alex", 34);
        Person person2 = new Person("Tom", 36);
        Person person3 = new Person();

        person1.move();
        person2.talk();
        person3.talk();
    }
}
