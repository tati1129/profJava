package practice._01_23.task1;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw Square of " + getColor() + " with side " + side);
    }
}
