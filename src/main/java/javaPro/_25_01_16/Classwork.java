package javaPro._25_01_16;

public class Classwork {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "x5", 2000);
        Car car2 = new Car("Volvo", "xc90", 2005);

        //System.out.println(car1.count);//2после создания 2х объектов, count увеличился
        System.out.println(car1.isMoving());

        System.out.println(car1.count);
        car1.count = 14;
        System.out.println(car2.count);


        Cat cat = new Cat();
        cat.setName("Bars").setAge(3).setWeight(6);
//        cat.setAge(3);
//        cat.setWeight(6);

    }
}
