package lessons.lesson_12;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Два способа преобразования типа данных
        1. Неявное преобразование (автоматическое)
        2. Явное преобразование (кастинг)

        Неявное преобразование происходит автоматически, когда значение меньшего типа данных
        преобразуется в бОльший тип данных
         */
       byte byteVal = 123;
       int intVal;
       intVal = byteVal; // неявное преобразование типа int в byte
        System.out.println(((Object) intVal).getClass().getName() + " " + intVal);

        System.out.println("==============");

        int byteVal1 = 1299;
        byte intVal1;
        intVal1 = (byte) byteVal1; // неявное преобразование типа byte в int не пройдет, будет ошибка, только явное
        System.out.println(((Object) intVal1).getClass().getName() + " " + intVal1);

       double doubleVal2 = 42.9;
       int int1 = (int) doubleVal2; // явное преобразование из double в int
        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("int1: " + int1);

        int x = 20;
        int y = 7;
        double result;
        result = x / y;
        System.out.println(result); // 20 / 7 -> 2 (int) -> неявное автоматическое преобразование 2->2.0->result

        result = x / 7.0;
        System.out.println("result: " + result);
        /*
            Когда в выражении (в формуле) присутствуют несколько типов данных,
            то все меньшие типы данных автоматически, неявно, приводятся к более широкому типу
            (float) 20 / 7 -> 20.0f / 7 -> 20.0f / 7.0f -> 2.85f -> авто 2.85d -> result
            1. int x - явно преобразуется во float
            2. int y - неявно преобразуется во float
            3. Производится деление 20.0f / 7.0f -> 2.85f
            4. 2.85f - неявно (авто) преобразуется в тип данных double
         */

        result = (float) x / y;
        System.out.println("result: " + result);
    }
}
