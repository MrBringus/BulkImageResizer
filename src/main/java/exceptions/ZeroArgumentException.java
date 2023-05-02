package exceptions;

public class ZeroArgumentException extends IllegalArgumentException {
    public ZeroArgumentException() {
        super();
    }

    public ZeroArgumentException(String message) {
        super(message);
    }

    public ZeroArgumentException(Throwable cause) {
        super(cause);
    }

    public ZeroArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}