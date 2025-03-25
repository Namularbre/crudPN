package exception;

public class UnknownEmployeeTypeException extends RuntimeException {
    public UnknownEmployeeTypeException(String type) {
        super("Unknown type: " + type);
    }
}
