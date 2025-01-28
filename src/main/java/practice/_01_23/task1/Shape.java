package practice._01_23.task1;

/**
 * Создайте абстрактный класс Shape и его наследники Circle, Square, Triangle.
 * Класс Shape содержит метод draw() и переменную хранящую цвет.
 * Классы Circle, Square, Triangle содержат переменные радиус, сторона квадрата,
 * сторона треугольника соответственно.
 * В main создать массив содержащий эти фигуры. В цикле у каждой фигуры
 * вызвать метод draw , который будет выводить в консоль сообщение
 * в формате «Draw <форма фигуры> of <цвет> color with a <соответствующий параметр>».
 */
abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();

    public static void main(String[] args) {
 Shape[] figures ={new Triangle("red", 4), new Circle("green", 2), new Square("blue" , 4)};

 for (Shape figure : figures){
     figure.draw();
 }
    }
}
