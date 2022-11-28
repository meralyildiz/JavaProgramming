package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

      oddOrEven(15);

        System.out.println("---------------------------------");

       agePerson(1998);
       printNumbers(10,15);
    }

    // create a function that can check if a number is odd or even number
    public static void oddOrEven (int number){
        if( number %2 == 0){
            System.out.println( number + " is even number");

        }else{
            System.out.println( number + " is odd number");
        }

    }

    // create a function that can display age of the person
    public static void agePerson(int birthYear){
        int age = 2022 - birthYear;

        System.out.println( "Your age is: " +age );


    }

    // create a function that can print all number between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }

    }
}
