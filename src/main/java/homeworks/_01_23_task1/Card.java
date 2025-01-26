package homeworks._01_23_task1;



public class Card implements ChangeBalance, Converter {

    private String userName;
    private double balance;

    public Card(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public Card(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
