package org.example.dz1;

/**7. Реализуйте метод для нахождения гипотенузы

 Напишите метод findHypotenuse(double a, double b), который вычисляет гипотенузу прямоугольного треугольника по теореме Пифагора:

 гипотенуза=a2+b2\text{гипотенуза} = \sqrt{a^2 + b^2}.

 Используйте метод Math.sqrt() для вычисления корня.

 Проверьте работу метода.
 */

public class RightTriangle {
    double a;
    double b;

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main (String[] args) {
        double hypotenuse = findHypotenuse(1.5, 2);
        System.out.println("Гипотенуза = " + hypotenuse);
    }

}

