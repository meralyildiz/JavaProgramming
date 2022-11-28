package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); //121 concatenation because there is String used
        System.out.println(10 + 20); //30, Addition
        System.out.println( 100 - 50); //50, subtraction
        System.out.println(100 / 3); // both integers and as a result we will have integer number withourt decimals
        System.out.println(10.0 /4); //if we want to have exact result that has also decimal in result we have to write one of the number with decimal
        System.out.println(10 / 4.0);
        System.out.println( 10d / 4); //the way "d" to obtain the result in decimal


        int a = 100;
        double b = a/6;
        System.out.println(b);

        //double c = a/6.0;
        double c = a/6d; // we have two options denominator with decimal or we put after 6 "d"

       System.out.println(c);

        }
    }
        /*
        +: Addition
        -: Subraction
        *: multiplication
        /: division
        in math: 10/4= 2.5
        in java: 10/4= 2
                   10.0/4= 2.5
        %: Remainder

         */