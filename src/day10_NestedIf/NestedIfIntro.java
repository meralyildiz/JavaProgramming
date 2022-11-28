package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 105;
        if (score <=100 && score >=0) { // if the score is valid
            if (score > 60) {// if the student passed the exam
                System.out.println("Passed");
            } else { // if the student failed exam
                System.out.println("Failed");
            }

        } else{ // if the score is not valid
            System.out.println("invalid score");
        }
        System.out.println("----------------------------------------------------------------");

        int age = 50;
        boolean hasId = false;

        if(hasId){ // if the person has ID
            if (age >= 21){ // if the person is 21 old or older
                System.out.println("Eligible to buy alcohol");
            } else{ //if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person has not ID
            System.out.println("You must have ID to buy alcohol");
        }
        System.out.println("-------------------------------------------------------------------");

        int number = 5;

        if (number >=1 & number<=7 ) { //if the number is a valid number (1-7)
            if(number==1){
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            } else if (number==3) {
                System.out.println("Wednesday");
            } else if (number==4) {
                System.out.println("Thursday");
            } else if (number==5) {
                System.out.println("Friday!! Finally weekend");
            } else if (number==6) {
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }


        }else{
            System.out.println("Invalid number");
        }








    }
}
