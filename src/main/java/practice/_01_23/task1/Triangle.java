package practice._01_23.task1;

public class Triangle extends Shape {
    private double side;

    public Triangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle of " + getColor() + " with a side " + side);
    }
}
