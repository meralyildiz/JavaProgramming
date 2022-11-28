package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 6;

        int count=0;


       while (num1 >= num2){
            num1 -= num2;
            count++;

        }
        System.out.println(count + " with a remainder of "+num1);

    }
}
/*
 1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reminder of 2
 */