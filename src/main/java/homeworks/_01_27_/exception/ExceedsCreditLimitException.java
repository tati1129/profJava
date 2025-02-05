package homeworks._01_27_.exception;

public class ExceedsCreditLimitException extends RuntimeException {
    public ExceedsCreditLimitException(String message) {
        super(message);
    }
}