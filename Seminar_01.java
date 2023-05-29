package Algoritmy_Semiar_01;

import java.time.Duration;
import java.time.LocalTime;

public class Seminar_01 {
    public static void main(String[] args) {
        // LocalTime timeStart = LocalTime.now();
        // System.out.println(sum(500000));
        // LocalTime timeEnd = LocalTime.now();
        // System.out.println("Время выполнения: " + Duration.between(timeStart, timeEnd)); // время выполнения

        // LocalTime timeStart2 = LocalTime.now();
        // System.out.println(sum2(500000));
        // LocalTime timeEnd2 = LocalTime.now();
        // System.out.println("Время выполнения: " + Duration.between(timeStart2, timeEnd2));

        LocalTime timeStart3 = LocalTime.now();
        numbers(20);
        LocalTime timeEnd3 = LocalTime.now();
        System.out.println("Время выполнения: " + Duration.between(timeStart3, timeEnd3));


    }

    public static long sum (long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long sum2 (long n) {
        long sum2 = n * (n + 1) / 2;
        return sum2;
    }

    public static void numbers (double n){ // поиск простых чисел
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }
    }

    public static void bounse (int k, int n) { // поиск всех возможных комбинаций игровых кубиков k с гранями n
        int count = 0;
        
    }
}