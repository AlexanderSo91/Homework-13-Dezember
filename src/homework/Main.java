package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        System.out.println("\nЗадача_1");


        int[] paymentAmount = generateRandomArray();

        System.out.println(Arrays.toString(paymentAmount));

        int paymentSum = 0;

        for (int payment : paymentAmount) {
            paymentSum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + paymentSum + " рублей");

    }


    public static void task2() {

        System.out.println("\nЗадача_2");

        int[] paymentAmount = generateRandomArray();

        System.out.println(Arrays.toString(paymentAmount));

        int paymentMax = Integer.MIN_VALUE;
        int paymentMin = Integer.MAX_VALUE;

        for (int payment : paymentAmount) {

            if (payment > paymentMax) {
                paymentMax = payment;
            }
            if (payment < paymentMin) {
                paymentMin = payment;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + paymentMin + " рублей. Максимальная сумма трат за день составила " + paymentMax + " рублей");
    }


    public static void task3() {

        System.out.println("\nЗадача_3");
        int[] paymentAmount = generateRandomArray();

        System.out.println(Arrays.toString(paymentAmount));

        int paymentSum = 0;
        int days = 30;

        for (int payment : paymentAmount) {
            paymentSum += payment;
        }
        double paymentAverage = (double) paymentSum / days;
        System.out.println("Средняя сумма трат за месяц составила " + paymentAverage + " рублей");

    }

    public static void task4() {

        System.out.println("\nЗадача_4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName [i]);
        }

    }

}

