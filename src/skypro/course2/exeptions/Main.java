package skypro.course2.exeptions;

public class Main {
    public static void main(String[] args) {
        try {
            UserRegistration.checkLogsParam("fi_fimova_", "hf_1122", "hf_112");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}