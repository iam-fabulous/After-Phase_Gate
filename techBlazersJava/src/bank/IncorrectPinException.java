package bank;

public class IncorrectPinException extends RuntimeException {
    public IncorrectPinException(String message) {
        super(message);
    }
}
