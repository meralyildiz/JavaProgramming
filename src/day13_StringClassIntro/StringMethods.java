package day13_StringClassIntro;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
        //     index : 01234
        char zeroChar = word.charAt(0);
        char firstChar = word.charAt(1);
        char secondChar = word.charAt(2);
        char thirdChar = word.charAt(3);
        char fourthChar = word.charAt(4);

        System.out.println(zeroChar);
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(fourthChar);

        /* char tenthChar = word.charAt(10);
        System.out.println(tenthChar); //this index number doesn't exit so it the result is warning "String index out of range: 10"
         */

        System.out.println("-------------------------------------------------");
        //LENGTH() method
        String s1 = "Batch 25 us the best batch."; //everything included in double quote is counted even the space
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1 ); // last index number -> way to find the last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println ("---------------------------------------------");
        //toLowerCase and toUpperCase methods

        String str = "wooden spoon";
        /*
        As this Sting is immutable the compiler could not transform the object in upper case,
        and we should assign the previous object to the next object
         */
       str = str.toUpperCase(); //"WOODEN SPOON"
        System.out.println("str = " + str);


        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println("s = " + s);

        //Today is a great day to learn jana programming language
        String sentence = "Today is a great day to learn jana programming language";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);
    }
}
