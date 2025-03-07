package lesson_29;

// Объекты могут принадлежать классу Х и при этом могут быть приведены
// к другому типу, если между классами есть связь наследования.
// Это называется кастингом (casting)

// Кастинг бывает двух видов:
// - Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
// - Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса.


import lesson_28.animals.Animal;
import lesson_28.animals.Cat;
import lesson_28.animals.Dog;
import lesson_28.animals.Hamster;

public class CastingExample2 {
    public static void main(String[] args) {
       // Восходящее и нисходящее преобразование

        // Восходящее образование происходит автоматически.

        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal
        // ВАЖНО!
        // Тип ссылочной переменной определяет:
        // 1. Ссылки на объекты каких типов могут хранится в этой переменной
        // 2. Список методов, которые можно вызвать обращаясь к этой переменной

        // реализация метода определяется объектом, который привязан по ссылке
        System.out.println(animal);
        animal.voice();

        System.out.println("============");
        Animal animal1 = new Hamster(); // Неявное автоматическое преобразование Hamster к типу Animal
        animal1.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
           animals[i].voice();
        }

       // TODO Нисходящее преобразование
        System.out.println("\n===============");
        int intX = 10;
        double doubleX = intX; // неявное преобразование восходящее
        System.out.println(doubleX);

        intX = (int) doubleX; // явное нисходящее преобразование

        Animal animalD = new Dog(); // Upcasting - восходящее неявное (но объект никто не режет, его методы)
        Dog dog = (Dog) animalD; // Downcasting - явное нисходящее пребразование
        dog.bark();

        Animal animalCat = new Cat();
        // Если попытаться привести объект к неверному типу
        // будет ошибка компиляции - ClassCastException
//        Dog dog1 = (Dog) animalCat;
//        dog1.bark();

        for(int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();
            // Можно проверить тип объекта для избежания ошибок перед downcasting
            if (currentAnimal instanceof Cat) {
                System.out.println(currentAnimal + " -> is a cat");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // вызов специфического метода кота
            }

            if (currentAnimal instanceof Dog) {
                System.out.println(currentAnimal + " -> is a Dog");
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }
        }

    }
}
