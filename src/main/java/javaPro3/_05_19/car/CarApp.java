package javaPro3._05_19.car;

public class CarApp {
    public static void main(String[] args) {
        CarService service = new CarService();

        CarProducer carProducer = service.createCarProducer();
        Car car = service.createCar(carProducer);

        System.out.println(carProducer);
        System.out.println(car);
    }

}
