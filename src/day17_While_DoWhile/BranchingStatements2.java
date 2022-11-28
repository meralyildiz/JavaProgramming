package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'e'; i++) {
            if (i == 'c') {
                continue;
            }
            System.out.println(i);

            System.out.println("----------------------------------");

            //print all even number between 1-10 (skip the odd numbers)
            for (int k = 1; k <= 10; k++) {
                if (k % 2 != 0) { //if the number is not divisible by two then print them
                    continue;
                }System.out.println(k); //
            }


                System.out.println("-----------------------------------");
                //print all odd numbers between 1-10 (skip the even numbers)
                for (int j = 1; j <= 10; j++) { //2,4,6,8,10
                    if (j % 2 == 0) { //if the number is divisible by 2 then leave them, continue so take the odd numbers
                        continue;

                    }
                    System.out.println(j); //1,3,5,7,9
                }
            }
        }
    }
