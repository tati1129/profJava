package homeworks._01_27_.exception;

public class InvalidDepositAmountException extends RuntimeException {
    public InvalidDepositAmountException(String message) {
        super(message);
    }
}