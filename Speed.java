package org.example.dz1;

/**
 * 6. Напишите метод для вычисления средней скорости
 *
 * Создайте метод averageSpeed(double distance, double time), который вычисляет среднюю скорость по формуле:
 *
 * скорость=расстояние/время\text{скорость} = \text{расстояние} / \text{время}.
 *
 * Проверьте работу метода с несколькими значениями.
 */

public class Speed {
    private double distance;
    private double time;

    public Speed(double someDistance, double someTime) {
        this.distance = someDistance;
        this.time = someTime;
    }

    public static double averageSpeed(double distance, double time) {
        return distance/time;
        }

    public static void main(String[] args) {
        Speed Bike = new Speed(1.5,0.5);
        double bikeAverageSpeed = averageSpeed(Bike.distance, Bike.time);
        System.out.println("Средняя скорость велосипедиста #1 = " + bikeAverageSpeed + " (расстояние: " + Bike.distance + " / "  + "время: " + Bike.time + ")");


        Speed Bike2 = new Speed(3, 1.5);
        double bike2AverageSpeed = averageSpeed(Bike2.distance, Bike2.time);
        System.out.println("Средняя скорость велосипедиста #2 = " + bike2AverageSpeed + " (расстояние: " + Bike2.distance + " / "  + "время: " + Bike2.time + ")");

    }
}
