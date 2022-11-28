package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt(); //valid ade 1-120


        while ( !(age >= 1 && age<= 120)){
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Enter your age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizien? yes/no");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes")  || answer.equalsIgnoreCase("no") )){
            System.out.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizien? yes/no");
            answer = scan.next();

        }
        if( age >=18 && answer.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");

        }



    }
}
