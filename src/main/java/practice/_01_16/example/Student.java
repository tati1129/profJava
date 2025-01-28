package practice._01_16.example;

public class Student {

    private String name;

    private int age;

    private int rate;

    public Student() {
    }

    public Student(String name, int age, int rate) {
        this.name = name;
        this.age = age;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 55 ){
            this.age = age;
        }

    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                '}';
    }
}
