package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false");

       // boolean result = input.nextBoolean();
        System.out.println("Enter your full name");//Java Programming
        String name = input. next(); // next method reads inputs only until a space that's why the result is only Java not Java Programming

        System.out.println("name = " + name); //Java

        input.close();

    }
}
