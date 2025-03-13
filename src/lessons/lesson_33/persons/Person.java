package lessons.lesson_33.persons;

import java.util.Arrays;

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
        if (isEmailValid(email)) {
            this.email = email;
        }
    }
    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        if (indexAt == -1 || indexAt != lastAt) return false;
        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;
        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) return false;
        // 4. Алфавит, цифры, '-', '_', '@', '.'
        // string.toCharArray() -> char[]
        for (char ch: email.toCharArray()) {
            // проверка символа н правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch) ||
                    ch == '-' || ch == '_' || ch == '.' || ch == '@';
            if (!isPass) return false;
        }
        // 5. До собаки должен быть хотя бы один символ
        if (indexAt == 0) return false;
        //6. Первый символ - должна быть буква
        boolean firstChar = Character.isLetter(email.charAt(0));
        if (!firstChar) return false;

        return true;
    }

    // Требования к паролю
    //    Длина пароля >= 8
    // 0. Минимум 1 цифра
    // 1. Минимум 1 маленькая буква -> Character.isLowerCase()
    // 2. Минимум 1 большая буква
    // 3. Минимум 1 спецсимвол "!%$@&*()[]<.-"

    // Пароль должен удовлетворять всем требованиям
    private boolean isPasswordValid(String password){
        if (password == null || password.length() < 8) return false;
        boolean[] passed = new boolean[4];
        for (char ch: password.toCharArray()) {
            if (Character.isDigit(ch)) passed[0] = true;
            if (Character.isLowerCase(ch)) passed[1] = true;
            if (Character.isUpperCase(ch)) passed[2] = true;
            for(char specCh: "!%$@&*()[]<.-".toCharArray()) {
                if (ch == specCh) {
                    passed[3] = true;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(passed));
        for (boolean bool: passed) if (!bool) return false;

        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
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
