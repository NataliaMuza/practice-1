package org.example.dz1;

/** 3. Реализуйте метод для нахождения разницы между двумя числами
 *
 * Создайте метод difference(int x, int y), который возвращает разницу между двумя числами.
 *
 * Проверьте работу метода в main.
 */

public class Difference {
    int x;
    int y;

    public static int difference(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        int difference1 = difference(7, 5);
        System.out.println("Разница между 7 и 5 = " + difference1);
    }
}
