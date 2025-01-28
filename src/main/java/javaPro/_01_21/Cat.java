package javaPro._01_21;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " говорит мяу");
    }
    public  void meow(){
        System.out.println("Meow..");
    }
}
