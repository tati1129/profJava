package homeworks._05_09;

public class Shop {
    int item1;
    int item2;
    int discount = 100;

    public void shopWithDiscount(){
        int result = (item1+item2)-discount;
        System.out.println("Shopping with discount is : " + result);
    }

}
