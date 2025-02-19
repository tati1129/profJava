package homeworks._02_07;

import java.util.*;

/**
 * 21. Создать класс Point для хранения координат (x, y) точки на плоскости. Создать список точек, отсортировать по координате y. Создать TreeSet со всеми уникальными точками. Создать TreeSet со всеми различными по координате y точками.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point[" + x + ". " + y + "]";
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(5, 0);
        Point point3 = new Point(6, 0);
        Point point4 = new Point(0, 1);

        List<Point> pointList = List.of(point1, point2, point3, point4);

        System.out.println(sortedByY(pointList));

        System.out.println(uniqPoints(pointList));

        System.out.println(uniqPointByY(pointList));
    }

    public static List<Point> sortedByY(List<Point> pointList) {
        List<Point> sortedPoints = new ArrayList<>(pointList);

        Collections.sort(sortedPoints, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getY(), o2.getY());
            }
        });
        return sortedPoints;
    }

    //Создать TreeSet со всеми уникальными точками.
    public static TreeSet<Point> uniqPoints(List<Point> pointList) {

        TreeSet<Point> uniqeSet = new TreeSet<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                // Сравниваем сначала по x, если x одинаковые, сравниваем по y
                int compareX = Integer.compare(o1.getX(), o2.getX());
                if (compareX != 0){
                    return compareX; // Если x разные, возвращаем результат сравнения по x
                }
                return Integer.compare(o1.getY(), o2.getY());
            }
        });
        uniqeSet.addAll(pointList);
        return uniqeSet;
    }

//Создать TreeSet со всеми различными по координате y точками.
    public static TreeSet<Point> uniqPointByY(List<Point> pointList) {

        TreeSet<Point> uniqeSet = new TreeSet<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getY(), o2.getY());
            }
        });
        uniqeSet.addAll(pointList);
        return uniqeSet;
    }
}
