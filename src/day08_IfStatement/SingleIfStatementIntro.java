package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
         int number = 301;
         boolean evenNumber = number %2 == 0;
         boolean oddNumber= !evenNumber; // not even number

         if(evenNumber){ //even number
             System.out.println( number + " is even number");
         }


        if(oddNumber) //odd number
            System.out.println( number + " is odd number");


        System.out.println("---------------------------------------------------------");

        int n = 200;

        if ( n > 0){ //if the n is greater than zero, then it's positive
            System.out.println( n + " is positive");
        }

        if (n < 0){ //if the n is less than zero, then it's negative
            System.out.println( n + " is negative");
        }

        if (n == 0){ // if the n is equal to zero then it is 0 (zero)
            System.out.println( n + " is 0");
        }

        System.out.println("------------------------------------------------------------");
        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = n == 0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);
        }




    }
/*
even number when the number is divisible by 2
odd number when the number can not be divided by 2
 */