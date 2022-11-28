package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age: 38 years old
byte age = 38;

        //weight: 160 pounds
        //byte weight = 160; 160 is out of byte's range
        int weight = 160;
       // byte num =-129; -129 is out of byte' range
        short num = -129;
        //salary: 100000$
        //short salary =100000; //100000 is out of short's range
     int salary =100_000;// int is the most preferred data type for integer number

        //int asset = 3333333333;//3333333333 is out of int' range
        long asset = 3_333_333_333L;// add L for long primitive type


        float tax = 0.26F; //tax: 0.26
        double pi = 3.26; //the most preferred of the decimal numbers

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 96;
        System.out.println("ch3 = " + ch3);
        char ch4 = 125;
        System.out.println("ch4 = " + ch4);
        char ch5 = 115;
        System.out.println("ch5 = " + ch5);

        char grade = 'F';
        char yesNo = 'Y';
        char gender = 'F';
        char north = 'N';
        char south = 'S';
        char east = 'E';
        char west = 'W';

        System.out.println("west = " + west);
        System.out.println("east = " + east);
        System.out.println("south = " + south);
        System.out.println("west = " + west);
        System.out.println("gender = " + gender);
        System.out.println("yesNo = " + yesNo);
        System.out.println("grade = " + grade);

        System.out.println();

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;


        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);
        System.out.println();

        String name = "WoodenSpoon"; // if we have more than one character we should use String, sequence of characters, string of character ""
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);






    }


}
