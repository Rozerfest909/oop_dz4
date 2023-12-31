package Task_3;
//Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два
//параметра типа T и возвращает максимальное значение из них.
//
//В этом примере мы объявляем обобщенную функцию getMax, которая принимает два
//параметра типа T, ограниченных интерфейсом Comparable. Мы используем метод
//compareTo для сравнения значений и возвращаем максимальное значение из двух.
//
//В методе main мы вызываем getMax с разными типами данных: целое число (Integer),
//число с плавающей запятой (Double) и строку (String).
//В результате мы получаем максимальные значения из каждой пары и выводим их на
//консоль.
//
//Обобщения позволяют нам писать универсальный код, который может работать с
//разными типами данных, сохраняя при этом безопасность типов.

public class Task_3 {
    public static void main(String[] args) {
        Max<Integer> intValue = new Max<>();
        System.out.println("Максимальное целое число: " + intValue.getMax(2, 3));

        Max<Double> doubleValue = new Max<>();
        System.out.println("Максимальное дробное число: " + doubleValue.getMax(1.01, 2.02));

        Max<String> stringValue = new Max<>();
        System.out.println("Максимальная строка: " + stringValue.getMax("DZ_4", "Hello World. Task 3"));
    }
}