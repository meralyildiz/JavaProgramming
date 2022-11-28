package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizien = "USA";
        boolean isEligible = age>= 21 && citizien == "USA";

        // eligible
        if (isEligible){ // true
            System.out.println( "Eligible");
        }


        //not eligible
        if(!isEligible){ //!True ==> not true ==> false
            System.out.println(" Not Eligible");
        }
    }
}
