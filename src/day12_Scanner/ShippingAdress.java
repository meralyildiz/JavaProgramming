package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println( fullName +"\n" +buildingNumber+ " " + streetName +
                "\n"+cityName + " " + state + " " + zipCode);


        scan.close();


    }
}
/*
1.Enter your full name (nextLine() )
2. Enter your building name (next() )
3.Enter your street name (nextLine() )
4. Enter your city name (nextLine() )
5. Enter your state ( next() )
6. Enter your zip code ( next() )
 */