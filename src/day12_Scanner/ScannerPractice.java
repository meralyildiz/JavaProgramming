package day12_Scanner;

import java.util.Scanner;// regular import: import one class -specific class

//import java.util.*; wild import: imports everything from the package

public class ScannerPractice {
    public static void main(String[] args) {
 /*
        new Scanner(System.in);// if we don't assign the scanner we need to print the object everytime that I need to

        new Scanner(System.in);

        new Scanner(System.in);

        */
        Scanner scan = new Scanner(System.in);
        scan. nextInt();

        System.out.println("Enter a number between 1 to 7");

        int num = scan.nextInt();
        String result = "";

        if(num >= 1 && num<=7 ){
            // 7 possible outputs
            result = (num ==1)?"Monday" :(num == 2)?"Tuesday" :(num == 3)?"Wednesday"
                    :(num == 4)?"Thursday" :(num == 5)?"Friday"  :(num == 6)?"Saturday" :"Sunday";


        }else{
            result = "Invalid number";
        }
        System.out.println(result);

        scan.close();
    }
}
