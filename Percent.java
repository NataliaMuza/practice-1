package org.example.dz1;

/**Реализуйте метод для вычисления процентов

 Напишите метод calculatePercentage(double total, double part), который возвращает, какой процент от общего составляет часть.

 Формула: процент=(часть/общее)×100\text{процент} = (\text{часть} / \text{общее}) \times 100.

 Вызовите метод в main.
 *
 */

public class Percent {
    double total;
    double part;

    public Percent(double total, double part){
        this.total = total;
        this.part = part;
    }

    public double calculatePersentage() {
        return (part / total) * 100;
    }

    public static void main (String[] args) {
        Percent myPercent = new Percent(21, 10.5 );
        double pers1 = myPercent.calculatePersentage();
        System.out.println(pers1 + "%");
    }
}
