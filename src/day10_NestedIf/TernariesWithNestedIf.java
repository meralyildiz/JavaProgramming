package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int score = 85;
        if (score>=0 && score<=100){
            if (score>=60) {
                System.out.println("Congrats, you passed");
            } else {
                System.out.println( "Failed");
            }
        } else{
            System.out.println("Invalid score");
        }

        System.out.println("----------------------------------------------------");
        String result = (score>=0 && score<=100)? (score>=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);

        System.out.println("-----------------------------------------------------------");
        //SOLUTION 1
        int grade = 95;
        if (grade>=0 && grade<= 100) { //if the grade is valid
            // 5 possibilities A, B, C, D, E
            if(grade>=90){ //false; score<90
                System.out.println("Excellent");
            } else if (grade >=80) { //false; score<80
                System.out.println("Great");
            }else if (grade >=70 ) { // false; score <70
                System.out.println("Good");
            }else if (grade >=60) { // false; score <60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
             }else{ // if the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("-----------------------------------------------------------");
        //SOLUTION 2

        String result2 = (grade>=0 && grade<= 100)? (grade>=90)? "Excellent" :(grade >=80)? "Great" :(grade >=70 )? "Good" :(grade >=60)? "Passed": "Failed"
                     :"Invalid score";

        System.out.println(result);

        System.out.println("---------------------------------------------------------------------------");
    // SOLUTION 3
        String result3 = "";

        if (grade>=0 && grade<= 100) { //if the grade is valid

            result3 = (grade>=90)? "Excellent" :(grade >=80)? "Great" :(grade >=70 )? "Good" :(grade >=60)? "Passed": "Failed";

        }else{ // if the score is not valid
            result3 = "Invalid score";
        }
        System.out.println(result3);

        System.out.println("-----------------------------------------------------");
        int n = 12; //temporary
        String result4 = "";

        if (n>=1 && n<=12){ // if the number is valid (1-12)

            result4 = (n==1)? "Jan":(n==2)? "Feb":(n==3)? "Mar":(n==4)? "Apr":(n==5)? "May":(n==6)? "Jun"
                    :(n==7)? "July":(n==8)? "Aug":(n==9)? "Sep" :(n==10)? "Oct":(n==11)? "Nov" :"Dec";

        }else{
            result4 = "Invalid Number";

        }

        System.out.println(result4);


    }
}
