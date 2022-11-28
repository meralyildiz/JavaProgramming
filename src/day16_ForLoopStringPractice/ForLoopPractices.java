package day16_ForLoopStringPractice;

public class ForLoopPractices {
    public static void main(String[] args) {
        //15 16 17 18 ...45
        for (int i = 15; i <= 45; i++){ //15 16 17 ...45
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------");
        //100 99 98 97 ..... 50
        for (int i = 100; i>=50; i--){ //i: 100 99 98 97 ...50
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int i = 1; i <= 55; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        //print all the even numbers between 1-55: 2,4,6,8....54

        for (int i = 2; i <= 54; i+= 2){ //i : 2,4,6,8..54
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        // A -Z
        for ( char i = 'A'; i <= 'Z'; i++){
            System.out.print( i + " ");
        }
        System.out.println();
        // a -z
        for( char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Z-A
         for( char i = 'Z'; i >= 'A'; i--){
             System.out.print(i + " ");
         }
        System.out.println();
         //z-a
         for (char i = 'z'; i >= 'a'; i--){
             System.out.print(i + " ");
         }
        System.out.println();

         for (char i =1; i<=4000; i++){
             System.out.print(i + " ");
         }
    }

}
