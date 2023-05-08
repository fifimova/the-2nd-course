package skypro.course2.exeptions;

public class UserRegistration {

    public static void checkLogsParam(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина превышает допустимое значение");
        }
        if (!(login.matches("[a-zA-Z0-9_]+"))) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля превышает допутсимое значение");
        }
        if (!(password.matches("[a-zA-Z0-9_]+"))) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания");
        }
        if (!(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
