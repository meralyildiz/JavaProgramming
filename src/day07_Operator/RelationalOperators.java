package day07_Operator;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, >; >=
                        // assignment: = this is just an assignment
        boolean result1 = 20>40; //fasle
        System.out.println("result1 = " + result1);

    boolean result2 = 300 >= 150;
    System.out.println("result2 = " + result2);

    boolean result3 = 100 >= 100;
    System.out.println("result3 = " + result3);

    boolean result4 = 300 >= 500;
    System.out.println("result4 = " + result4);

    // credit score of 720

        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        System.out.println("------------------------------------------------------------------");

        // <; <=

        boolean result5 = 100<500;
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 100;
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <=59;
        System.out.println("hasFailed = " + hasFailed);

        int score2 = 75;
        boolean hasFailed2 = score2 <=59;
        System.out.println("hasFailed2 = " + hasFailed2);

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------------------------------");

        // qual ==  one = means only assignment
        int x = 100;
        int y = 200;

        boolean equal = x==y; //false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
        System.out.println("result10 = " + result10);

        System.out.println("----------------------------------------------------------------");

        boolean result11 = 100 != 200; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; //false
        System.out.println("result13 = " + result13);

    }
}


