package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         int min = 2147483647; //any number will be less than this number

         for ( int i = 10; i < 15; i++){
             System.out.println("Enter a number:");
             int num = scan.nextInt();

             if(num<min){
                 min = num;
             }

         }
        System.out.println("min = " + min);





    }
}
/*
write a program that asks to users a number for 5 times.
return the maximum number

 */