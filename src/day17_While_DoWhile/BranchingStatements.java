package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'a'; i < 'z'; i++) {
            if( i == 'f'){ //it exits the loop before reaching the letter 'f' - a to e
                break;
            }
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("--------------------------------------------------");
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < 0){
                break;
            }
        }

    }
}
