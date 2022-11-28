package day07_Operator;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -25;
        System.out.println(num1 < 0);
        System.out.println( num2 < 0);


        System.out.println( ++num1 ); // 26 ==> if we put ++ before the variable name it is pre-increment which means that it increases immediately by one
        System.out.println( --num1); // (26-1) 25==> if we put ++ before the variable name it is pre-decrement which means that it decreases immediately by one

        int a = 5;
       // -- a; // pre decrement: decreases the value by 1 right away

        /*
        POST INCREMENT - DECREMENT
         */

     int b = 100;
        System.out.println(++b); // 101 ==>pre increment: increases the value by one

        int c = 100;
        System.out.println( c++); //100 post increment= first passes the current value, then increases the value by 1
        System.out.println( c); //101

        System.out.println("-------------------------------------------------");

        int x = 200;
        System.out.println( --x ); //199 pre decrement operator= it decreases the value by 1 right away

        System.out.println();
        System.out.println("-----");
        System.out.println();

        int y = 200;
        System.out.println( y--); // 200 ==> post decrement first the current value and then decreases the value by 1
        System.out.println(y);

        int t = 200;
        System.out.println( t--); // it passes first the current value then it decreases by one in the second line
        System.out.println( t++);
        System.out.println(t--);

        int q = 30;
        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q); //28




    }



}
