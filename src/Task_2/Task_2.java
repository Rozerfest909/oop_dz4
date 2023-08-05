package Task_2;

import static Task_2.ForArrays.printArray;

//Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого
//типа и выводит его элементы на консоль.
//В этом примере мы объявляем обобщенный метод printArray, который принимает
//массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам
//массива и вывести их на консоль.
//
//В методе main мы создаем массивы типов Integer и String и вызываем printArray
//для каждого из них.
//В результате мы получаем вывод на консоль элементов каждого массива.
//
//Таким образом, обобщенные методы позволяют нам создавать код, который может
//работать с разными типами данных, обеспечивая повторное использование и
//гибкость.

public class Task_2 {
    public static void main(String[] args) {
        Integer[] intArray = {0, 1, 2, 3};
        String[] stringArray = {"Hello World. Task 2"};

        System.out.println("Число > ");
        printArray(intArray);

        System.out.println("Строка > ");
        printArray(stringArray);
    }
}