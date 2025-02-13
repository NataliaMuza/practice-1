package org.example.dz1;

/**
 * 8. Напишите метод для вычисления длины окружности
 *
 * Создайте метод circleCircumference(double radius), который возвращает длину окружности (2πr2 \pi r).
 *
 * Используйте значение π\pi из Math.PI.
 *
 * Проверьте метод на нескольких радиусах.
 */

public class Circle {
    private double radius;
    static double pi = Math.PI;

    public Circle(double radius,double pi){
        this.radius = radius;
        this.pi = pi;
    }

    public double circleCircumference(double radius) {

        return (2 * Math.PI * radius);
        }

    public static void print(double radius) {
        System.out.println("Длина окружности вычисляется по формуле = 2 * " + pi + " " + "*" + " " + radius);
    }
public static void main (String[] args) {

        Circle circle1 = new Circle(5,pi);
        double circle1Circumference = circle1.circleCircumference(5);
        System.out.println("Длина окружности для круга 1 равна: " + circle1Circumference);
        Circle.print(5);


        Circle circle2 = new Circle(10,pi);
        double circle2Circumference =  circle2.circleCircumference(10);
        System.out.println("Длина окружности для круга 2 равна: " + circle2Circumference);
        Circle.print(10);
    }
}
