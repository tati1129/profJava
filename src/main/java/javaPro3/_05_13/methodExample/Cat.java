package javaPro3._05_13.methodExample;

public class Cat {
    String name;
    int age;

    public void catMeow(){
        System.out.println("Meow !!!");
    }
    public void catBirthday(){
        System.out.println("Happy Birthday, Cat!");
        System.out.println(" Cat was : " + age + "year");

        age += 1;

        System.out.println(" Today : " + age);
    }
}
