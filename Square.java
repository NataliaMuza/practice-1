package org.example.dz1;

/**
 * 4. Создайте методы для вычисления площади и периметра квадрата
 *
 * Создайте методы:
 * squareArea(int side) — возвращает площадь квадрата (side×sideside \times side).
 * squarePerimeter(int side) — возвращает периметр квадрата (4×side4 \times side).
 * Вызовите методы в main с примерными значениями.
 */

public class Square {
    int side = 2;

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {

        int area1 = squareArea(2);
        System.out.println("Площадь квадрата: " + area1);

        int perimeter1 = squarePerimeter(2);
        System.out.println("Периметр квадрата: " + perimeter1);

    }

}
