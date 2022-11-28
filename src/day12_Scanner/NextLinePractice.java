package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");//19
        int age = scan.nextInt();

        scan.nextLine(); //Enter

        System.out.println("Enter your full name");// Maria MercedesEnter
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA");//3.5
        double gpa = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter school name");
        String schoolName = scan.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + gpa);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }

}
