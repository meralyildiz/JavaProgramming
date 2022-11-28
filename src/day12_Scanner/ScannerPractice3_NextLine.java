package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); //Wooden SpoodEnter

        System.out.println("Enter your programming language");
        String programmingLanguage = scan.nextLine();//Java Programming LanguageEnter


        System.out.println("Enter your age");
        int age = scan.nextInt(); //24 --> this doesn't read "enter", we will have an "enter" as a result for the next line method

        scan.nextLine(); //Enter --> that's why we write another nextLine method
        //if we are using nextLine() method after the other methods of scanner, we MUST provide one addition nextLine()


        System.out.println("Enter your school name");
        String schoolName = scan.nextLine(); //Cydeo SchoolEnter


        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);




    }
}
