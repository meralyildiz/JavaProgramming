package day10_NestedIf;

import java.beans.PropertyEditorSupport;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90-100= Excellent
        80-89 = Great
        70-79 = Good
        60-69 = Passed
        0-59 = Failed
         */
        int grade = 95;
        String result = ""; //temporary

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

        System.out.println(result);


    }
}
