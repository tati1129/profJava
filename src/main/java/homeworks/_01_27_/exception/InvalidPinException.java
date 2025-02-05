package homeworks._01_27_.exception;

public class InvalidPinException  extends RuntimeException{
    public InvalidPinException(String message) {
        super(message);
    }
}