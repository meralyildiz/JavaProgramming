package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
       //long num = 9L; refused data type
        // float num = 9F;refused data type
        // double num = 9D;refused data type
        // boolean num = true refused data type
        //byte num = 9; accepted data type
        // char num = '9'; accepted data type

        int num = 1;
        switch (num) {// 1,2,3,4,5,6,7,  == switch can be used only to compare variables
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
               break;

            case 4:
                System.out.println("Thursday");
               break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: // only gets executed if one of the case blocks are matching
                System.out.println("Invalid number");
                // we do not need to give break statement for the last block of the switch in order to exit thr switch

        }







    }
}
