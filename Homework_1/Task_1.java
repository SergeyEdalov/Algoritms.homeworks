package src.main.java.Homeworks.Homework_1;

import java.util.Random;

public class Task_1 {
    /**
     * Дано целое число N из отрезка [1; 1000]. Также даны N целых чисел Ai из отрезка [1; 1000000].
     * Требуется для каждого числа Ai вывести количество различных делителей этого числа.
     * В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
     * Для полученного решения укажите сложность в О-нотации.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int N = (int) (Math.random() * 1001);
        System.out.println("N = " + N);

        for (int i = 1; i <= N; i++) {
            int counter = 0;
            int ai = (int) (Math.random() * 1000001);
            for (int j = 1; j < ai; j++) {
                if (ai % j == 0) {
                    counter++;
                }
            }
            System.out.println("Число " + ai + " количество делителей = " + counter);
            counter = 0;
        }
    }

}
