package day15_ForLoop;

import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();


       word= word.replace("x", "a").replace("X", "a");

        System.out.println(word);
    }
}
