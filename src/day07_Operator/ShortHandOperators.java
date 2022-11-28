package day07_Operator;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment

        int number = 100;

        System.out.println( "number = " +number); //100

        number = 200;

        System.out.println( "number = " + number);

        String word = "Java Programming";
        System.out.println( "word = " + word);

        word =  "Wooden Spoon";
        System.out.println("word =" + word) ;
        word = "Cydeo";
        System.out.println( "word = " + word);
        word = "My name is Khan";
        System.out.println( "word = " + word);
        word = "JavaProgramming"; // it print the last value assigned to the variable
        word = "123" + 1; //1231+
        System.out.println(word);

        System.out.println("------------------------------------------------------");

        int x = 100;
        System.out.println("x : " + x);

       //  System.out.println( x + 200); //300 inorder to have x= 300 I have to do put an assignment ==> x= x+200

       // x = x + 200;
        x += 200; // this is the shortcut of we have done before ==> x = x+200
        System.out.println("x = " + x);

        String str = "Wooden ";
                str += "Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        availableBalance += 300; // availableBalance = 1000.50 + 300
        System.out.println("availableBalance = $" + availableBalance);

        System.out.println("----------------------------------------------------------");

        //withdrawing 500$

        availableBalance -= 500; //  availableBalance 1300.50-500 = 800.50
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200, then depositing 400
        availableBalance -= 200; //available balance 800.50-200 =600.50
        availableBalance += 400; // available balance 600.50+400 = 1000.50

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------------------------------------");
        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;

        System.out.println("dodge = " + dodge);

        System.out.println("--------------------------------------------------------------");

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------------------------------");

        double num3 = 100;
        // %=  remainder asignment
        num3 %= 3;
        System.out.println(num3);

        System.out.println("--------------------------------------------------------");

        int amount = 127; //cents
        int quarters = 127/25;
        int cents = 127 % 25;

        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        System.out.println("--------------------------------------------------------");

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("---------------------------------------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("----------------------------------------------------------");

        int balance = 3500;

        //insurance fee: $153

        balance %= 153;
        System.out.println("balance = " + balance);



    }
}
