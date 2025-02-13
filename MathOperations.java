package org.example.dz1;

/**
 * 1. Напишите класс MathOperations
 * Создайте методы:
 * add(int x, int y) — возвращает сумму двух чисел.
 * subtract(int x, int y) — возвращает разность двух чисел.
 * multiply(int x, int y) — возвращает произведение двух чисел.
 * divide(int x, int y) — возвращает результат деления (тип double).
 * В методе main вызовите каждый метод с любыми значениями и выведите результаты.
 */

public class MathOperations {
    int x;
    int y;

    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y; //обязательно приводим тип возвращаемых данных к double
    }

    public static void main(String[] args) {

        int sum1 = add(4,4);
        System.out.println("Результат сложения: " + sum1);

        int subs = substract(6, 4);
        System.out.println("Результат вычетания: " + subs);

        int mult1 = multiply(2,5);
        System.out.println("Результат умножения: " + mult1);

        double div1 = divide(5, 2);
        System.out.println("Результат деления: " + div1);
    }
}
