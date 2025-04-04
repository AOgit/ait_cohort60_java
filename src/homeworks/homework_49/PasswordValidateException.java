package homeworks.homework_49;

// extends RuntimeException - для непроверяемых исключений
// extends Exception - для проверяемых исключений
public class PasswordValidateException extends Exception{
    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения
    */

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}
