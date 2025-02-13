package org.example.dz1;

/** 2. Реализуйте метод для нахождения максимума двух чисел

 Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.

 В качестве подсказки используйте метод Math.max(a, b).

 Вызовите метод из main и выведите результат.
 *
 */

public class findMax {
    int a;
    int b;

    public static int max(int a, int b) {
        return Math.max(a,b);
    }

    public static void main(String[] args) {

        int max = Math.max(5,1);
        System.out.println("Большее значение: " + max);

    }


}
