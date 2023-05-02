package exceptions;

public class ExcessiveArgumentException extends IllegalArgumentException {
    public ExcessiveArgumentException() {
        super();
    }

    public ExcessiveArgumentException(String message) {
        super(message);
    }

    public ExcessiveArgumentException(Throwable cause) {
        super(cause);
    }

    public ExcessiveArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}