package homeworks._05_15.phone.var3;


public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone", "black", "y");

        System.out.println(phone);

        phone.changeSilent();
        System.out.println(phone);
    }
}
