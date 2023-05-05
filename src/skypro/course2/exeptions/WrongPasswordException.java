package skypro.course2.exeptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
