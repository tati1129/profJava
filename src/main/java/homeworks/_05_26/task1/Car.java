package homeworks._05_26.task1;

public class Car {
    private String producer;
    private String model;
    private int power;

    public Car(String producer, String model, int power) {
        this.producer = producer;
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
