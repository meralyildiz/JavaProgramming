package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {

        int n = 12; //temporary

        String result = (n==1)? "Jan":(n==2)? "Feb":(n==3)? "Mar":(n==4)? "Apr":(n==5)? "May":(n==6)? "Jun"
                :(n==7)? "July":(n==8)? "Aug":(n==9)? "Sep" :(n==10)? "Oct":(n==11)? "Nov" :"Dec";

        System.out.println(result);







    }
}
