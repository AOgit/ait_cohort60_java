package homeworks.homework_49;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            PersonValidator.validateEmail(email);
            System.out.println("Email прошел проверку");
            this.email = email;
        } catch (EmailValidateException ex) {
            System.out.println("Вы ввели некорректный email: " + ex.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
           PersonValidator.validatePassword(password);
            System.out.println("Пароль прошел проверку");
           this.password = password;
        } catch (PasswordValidateException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
