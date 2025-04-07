package homeworks.homework_50;

import homeworks.homework_49.PasswordValidateException;

import java.util.HashMap;
import java.util.Map;

public class NewPersonPasswordValidator {

    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null) throw new PasswordValidateException("password should be not null");

        Map<String, String> errMap = new HashMap<>();
        errMap.put("digit", "\n- отсутствует цифра");
        errMap.put("lowerCase", "\n- отсутствует буква в нижнем регистре");
        errMap.put("upperCase", "\n- отсутствует буква в верхнем регистре");
        errMap.put("special", "\n- отсутствует спецсимвол");

        if (password.length() < 8) errMap.put("length", "\n- длина меньше 8 символов");
        for (char ch: password.toCharArray()) {
            if (Character.isDigit(ch)) errMap.remove("digit");
            if (Character.isLowerCase(ch)) errMap.remove("lowerCase");
            if (Character.isUpperCase(ch)) errMap.remove("upperCase");
            if ("!%$@&*()[]<.-".contains(String.valueOf(ch))) errMap.remove("special");
        }

        if (!errMap.isEmpty()) {
            StringBuilder errMsg = new StringBuilder("\nПароль не соответствует минимальным требованиям: ");
            errMap.forEach((k, v) -> errMsg.append(v));
            throw new PasswordValidateException(errMsg.toString());
        }
    }

    }
