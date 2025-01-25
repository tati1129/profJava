package javaPro._01_21;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " говорит гав");
    }
}
