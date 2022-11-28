package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        /*
        System.out.println( true == !false);  // true
        System.out.println( !true != false); //false
        System.out.println( !false == true); //true

        System.out.println( !!false ); //false
        System.out.println( !!!true); //false

         */

      int score = 95; //0-100
        boolean a = score >= 90 && score <=100;
        boolean b = score >= 80 && !a; //!a = // && score <=89; //if the score is A, but
        boolean c = !a && !b && score >=70; // (boolean c = score >= 70 && score <=79;) boolean c is not equal to a and b but greater than 700
        boolean d = !a && !b && !c && score >= 60; // boolean d = score >= 60 && score <=69;
        boolean f = !a && !b && !c && !d && score <= 59;
        if (a) {// if the student made A
            System.out.println("Excellent");
        }

        if (b) { //if the student made B
            System.out.println("Great");
        }

        if(c) { //if the student made C
            System.out.println("Good");
        }
        if(d) {//if the student made D
            System.out.println("Pass");
        }

        if(f) { // if the student made F
            System.out.println("Failed");
        }



    }
}
/*
900-100 ==> Excellent
80-89 ==> Great
70-79 ==> Good
60-69 ==> Pass
0-59 ==> Failed





 */