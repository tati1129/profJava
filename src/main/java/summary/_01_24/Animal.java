package summary._01_24;

abstract public class Animal extends Animated{
    private boolean isHungry = true;

    public Animal(String name, int age) {
        super(name, age);
    }

    public void eat(){
        if (isHungry){
            System.out.println(getName() + " eats");
            isHungry = false;
        }else {
            System.out.println(getName() + " doesn't want to eat");
        }
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

}
