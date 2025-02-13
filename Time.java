package org.example.dz1;

/**
 * 5. Реализуйте метод для перевода секунд в минуты
 *
 * Напишите метод convertSecondsToMinutes(int seconds), который возвращает значение в формате:
 * минуты=секунды/60\text{минуты} = \text{секунды} / 60.
 * Вызовите метод в main и выведите результат.
 */

public class Time {
    int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static int convertSecondsToMinutes(int seconds){
        return seconds / 60;
    }



        public static void main(String[] args) {

        Time currentTime = new Time();
            currentTime.setSeconds(240);
        System.out.println("Время в секундах: " + currentTime.getSeconds());

        int minutes = convertSecondsToMinutes(currentTime.seconds);
        System.out.println(currentTime.getSeconds() + " секунд = " + minutes + " минут");
        }
}
