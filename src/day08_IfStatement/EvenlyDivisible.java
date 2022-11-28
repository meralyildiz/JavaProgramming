package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
      int number2 = 100;

        boolean divisibleBy2 = number2 %2 ==0; // if the remainder is divided by 2 is 0, then it is evenly divisible by 2
        boolean  divisibleby3 = number2 %3 ==0; // if the remainder is divided by 3 is 0, then it is evenly divisible by 3
        boolean divisibleby5 = number2 %5 ==0; // if the remainder is divided by 5 is 0, then it is evenly divisible by 5

        System.out.println(number2 + " is divisible by : " + divisibleBy2);
        System.out.println(number2 + " is divisible by 3: " + divisibleby3);
        System.out.println(number2 + " is divisible by 5: " + divisibleby5);




    }
}
/*
 2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

 */