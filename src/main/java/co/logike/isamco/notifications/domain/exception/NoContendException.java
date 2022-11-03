package co.logike.isamco.notifications.domain.exception;

public class NoContendException extends Exception {

    private static final long serialVersionUID = 1L;

    public NoContendException() {
        super();
    }

    public NoContendException(String message) {
        super(message);
    }

    public NoContendException(Throwable cause) {
        super(cause);
    }

    public NoContendException(String message, Throwable cause) {
        super(message, cause);
    }
}
