package day09_IfElse_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 85;


        if (grade>90){// if the student made A
            System.out.println("Excellent");
        } else if (grade >= 80 && grade<90) {
            System.out.println("Great");
        }

        else if(grade>=70 && grade <79) { //if the student made C
            System.out.println("Good");
        }
        else if (grade >= 60 && grade <69) {//if the student made D
            System.out.println("Pass");
        } else{// if the student made F
            System.out.println("Failed");
        }

    }


}
