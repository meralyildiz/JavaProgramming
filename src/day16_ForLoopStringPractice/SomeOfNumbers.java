package day16_ForLoopStringPractice;

import java.util.Scanner;

public class SomeOfNumbers {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i <= 100; i++) { // i// : 1,2,3,4,....100
            sum += i;

        }
        System.out.println(sum);// 5050
        System.out.println("---------------------------------------------------------");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            total += scan.nextInt();

        }
        System.out.println("total = " + total);
        scan.close();

        }
    }
