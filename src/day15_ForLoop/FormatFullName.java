package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scan.nextLine();

        // firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1). toLowerCase();
        System.out.println(firstName);


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the second name");
        String secondName = scan.next();
        secondName = (""+ secondName.charAt(0)).toUpperCase() + secondName.substring(1).toLowerCase();
        System.out.println(secondName);


    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */