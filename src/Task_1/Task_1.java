package Task_1;//
//Задача 1 : Напишите обобщенный метод printElement, который принимает один
//параметр типа T и выводит его на консоль.
//
//В этом примере мы объявляем обобщенный метод printElement, который принимает
//один параметр типа T. Мы просто выводим этот элемент на консоль с помощью метода
//System.out.println().
//
//В методе main мы вызываем printElement с различными типами данных: целое число
//(Integer), строку (String) и число с плавающей запятой (Double). Компилятор
//автоматически выводит тип параметра T на основе переданных аргументов.
//
//Таким образом, обобщенные методы позволяют нам писать код, который может
//работать с различными типами данных, обеспечивая простоту и гибкость
//использования.

public class Task_1 {
    public static void main(String[] args) {
        Integer int_task1 = 101;
        String str_task1 = "Hello World. Task 1";
        Double double_task1 = 1.01;

        Print.printElement(int_task1);
        Print.printElement(str_task1);
        Print.printElement(double_task1);
    }
}