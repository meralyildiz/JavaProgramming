package day11_Switch_Scanner;

public class GradeSwitchStatement {
    public static void main(String[] args){
        char ch = 'B';
        switch (ch){

            case 'A':
                 System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'E':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");

        }

    }

}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */