package homeworks._05_15.phone.var1;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone", "black", "yes");

        System.out.println(phone);

        phone.setIsSilent("no");
        System.out.println(phone);
    }
}
