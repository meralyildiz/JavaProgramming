package day07_Operator;

public class ArithmeticOperators {
    public static void main(String[] args) {
     int num1 = 10;
     int num2 = 3;
     int division = num1 / num2; //division variable contains the result of num1 divided by num2
     int remainder = num1 % num2; //remainder variable contains the result of num1 divided by num2

     // 10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println( num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

        // what is the remainder of 25 divided by 5
        System.out.println( 25 % 4); //25 - (4*6) = 1
        System.out.println( 25 % 5);
    }

}
