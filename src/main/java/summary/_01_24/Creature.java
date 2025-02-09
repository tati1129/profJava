package summary._01_24;

public abstract class Creature {

    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public void playing(Creature another){
        System.out.println(this.name + " playing with " + another.name);
    }

    public String getName() {
        return name;
    }


}
