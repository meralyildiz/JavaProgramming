package day15_ForLoop;

import java.util.Scanner;

public class StringMethodExercise {
    public static void main(String[] args) {
    /*
    Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");

        }
        System.out.println(word);


    }

    public static class FINRA {
        public static void main(String[] args) {
            for ( int i = 1; i <= 100; i++){
                if(i % 15 == 0){
                    System.out.print("FINRA "); //15,30,45,60,75,90
                }else if ( i % 3 ==0){
                    System.out.print("FIN "); //3,6,9,12...99
                }else if ( i % 5 ==0 ){
                    System.out.print("RA "); //5,10,15..100
                }else{
                    System.out.print(i + " ");
                }
            }

        }
    }

    public static class ForLoopIntro {
        public static void main(String[] args) {

            //     1        2       4
            for(int i = 1; i<= 10; i++){ //i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11
                System.out.println("Hello world!"); //i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            }
        }
    }
}
