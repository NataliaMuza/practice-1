package org.example.dz1;

/**
 * 10. Создайте методы для перевода градусов Цельсия в Фаренгейты и обратно
 *
 * Реализуйте два метода:
 * celsiusToFahrenheit(double celsius) — переводит температуру из градусов Цельсия в Фаренгейты (F=C×9/5+32F = C \times 9/5 + 32).
 * fahrenheitToCelsius(double fahrenheit) — переводит температуру из Фаренгейтов в Цельсии (C=(F−32)×5/9C = (F - 32) \times 5/9).
 *
 * Проверьте методы на нескольких значениях
 */

public class Degrees {
    double celcius;
    double fahrenheit;

    public Degrees(double celcius, double fahrenheit) {
        this.celcius = celcius;
        this.fahrenheit = fahrenheit;
        }

        public double getCelcius(){
            return celcius;
        }
        public double getFahrenheit() {
            return fahrenheit;
        }

        public double celsiusToFahrenheit(double celsius) {
            return celsius * 9/5 + 32;
        }

        public double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }


    public static void main (String[] args) {

        Degrees deg1 = new Degrees(25,55);

        System.out.println("Температура в Цельсиях:" + deg1.getCelcius());
        System.out.println("Температура в Фаренгейтах:" + deg1.getFahrenheit());

        double fResult = deg1.celsiusToFahrenheit(25);
        double cResult = deg1.fahrenheitToCelsius(55);

        System.out.println("25 Целсий = " + fResult + " " + "Фаренгейт");
        System.out.println("55 Фаренгейт = " + cResult + " " + "Цельсий");




    }
}

