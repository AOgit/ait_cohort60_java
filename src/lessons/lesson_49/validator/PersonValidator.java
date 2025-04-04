package lessons.lesson_49.validator;

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {

        // throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения)
        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Должна присутствовать @
        int indexAt = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("error @");
        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");
        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) throw new EmailValidateException("last . error");
        // 4. Алфавит, цифры, '-', '_', '@', '.'
        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {
            // проверка символа н правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch) ||
                    ch == '-' || ch == '_' || ch == '.' || ch == '@';
            if (!isPass) throw new EmailValidateException("illegal symbol");
        }
        // 5. До собаки должен быть хотя бы один символ
        if (indexAt == 0) throw new EmailValidateException("illegal symbol");
        //6. Первый символ - должна быть буква
        boolean firstChar = Character.isLetter(email.charAt(0));
        if (!firstChar) throw new EmailValidateException("illegal symbol");

    }

    }
