package day13_StringClassIntro;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.next();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your phone number");
        long number = scan.nextLong();

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School name");
        String schoolName =  scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");

        String StreetName = scan.nextLine();

        System.out.println("Full name : " + fullName);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Phone number = " + number);
        System.out.println("Adress: \n\t" + buildingNumber + " "+ StreetName + "\n \t"+ state +" " + zip );
        // \n --> new line \t -> paragraph line
        System.out.println("School name = " + schoolName);


        scan.close();


    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int) --> nextInt()
			2. Enter your gender (String- One word ONLY) --> next() and after nextLine()
			3. Enter your full name (String- Multiple words) --> nextLine()
			4. Enter your phone number (long) --> nextLong()
			5. Enter your zip code (int) --> nextInt
			6. Enter your School name (String - Can be Multiple words) --> nextLine()
			7. Enter your city name (String- Can be Multiple words)--> nextLine()
			8. Enter your state name (String- One word ONLY) --> next() and after nextLine()
			9. Enter your building number (int) --> nextInt  and after nextLine()
			10. Enter your Street name --> String nextLine()

			Display all the inputs that user entered in the following order in separate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. adress
			        BuildingNumber Street
			        City, State ZipCode


 */