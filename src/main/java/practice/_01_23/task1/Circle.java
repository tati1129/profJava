package practice._01_23.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle of " + getColor() + " with radius " + radius);
    }
}
