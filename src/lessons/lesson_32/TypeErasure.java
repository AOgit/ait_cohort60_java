package lessons.lesson_32;

public class TypeErasure <E> {
    private E value;

    public TypeErasure(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
    // 1. Нельзя сделать перегруженный метод, отличающийся только типами параметров
    public void method(TypeErasure<Integer> typeErasure) {
        System.out.println();
    }
//
//    public void method(TypeErasure<String> typeErasure) {
//        System.out.println(typeErasure);
//    }

    // 2. Нельзя создать обьект напрямую:
    public void method2() {
        TypeErasure<E> obj = new TypeErasure(value);
        System.out.println(obj);
//         E obj = (E) new Object();

    }

    public static void main(String[] args) {
        TypeErasure<Integer> t = new TypeErasure<>(5);
        t.method2();

    }

}
