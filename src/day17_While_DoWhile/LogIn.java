package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();


        if(u.equals("Cydeo") && p.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else {
            int attempt = 3;                                    //if the attempt is less then 0; 3>0, 2>0; 1>0
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt >0){
                if (attempt == 1) {
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attempt--;

            }
        } if(u.equals("Cydeo") && p.equals("Cydeo123") ) {
            System.out.println("Logged in");
        }else{
            System.out.println("Your account is lucked");
        }
        scan.close();


    }
}
