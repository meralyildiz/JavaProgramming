package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2001;
        int num = 2;

        String result = "";


        if(num>=1 && num<=12){// number 1-12

           switch (num){
               case 2:
                   result  = (year %4 == 0)? "29 days" : "28 days";// this case block contains if statement with ternaries
                   break;

               case 4: case 6: case 9: case 11:
                   result = "30 days";
                   break;

               default: // 1,3,5,7,8,10,12
                   result = "31 days";
           }

        }else{
           result= "Invalid number";
        }
        System.out.println(result);
    }
}
