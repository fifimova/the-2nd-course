package skypro.course2.exeptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
