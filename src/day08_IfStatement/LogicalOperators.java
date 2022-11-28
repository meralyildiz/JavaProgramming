package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizien = "UK";

        boolean isEligible = age>=18 && citizien == "USA"; // && Logical and operator ==> needs to be true both expressions in order to have true the result
                                 // 19>=18 && "UK == USA"
                                    //true && false ==> false

        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("-----------------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23,
        income = 40000;
        boolean isEligible2 = creditScore>=700 && age2 >21 && income >=60000 ;
                                // 720>= 700 && age 23>= 21
                                    //true && true ==> true
        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        String name3 = "James";
        String countryOfBirth = "USA";
        boolean marriedtoUSCitizien = false;
        boolean isEligible3 = countryOfBirth == "USA" || marriedtoUSCitizien == true; // || ==> logical or operator need to be true one of the two expression in order to have true
                                //true                ||   false

        System.out.println(name3 + " is eligible for US citizienship : " + isEligible3);

        System.out.println("---------------------------------------------------------------");

        String name4 = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;
        boolean isEligibleForScholarship = gpa >= 3.5 || familyIncome <= 80000;
        System.out.println(name4 + " is eligible for scholarship: " + isEligibleForScholarship);

        String name5 = "Rihanna";
        double gpa2 = 4.5;
        int familyIncome2 = 400000;
        boolean isEligibleForScholarship2 = gpa2 >= 3.5 || familyIncome2 <= 80000;
        System.out.println(name5 + " is eligible for scholarship: " + isEligibleForScholarship2);

        int score = 85;
        boolean passed =  score >= 60;
        boolean failed = !passed; // logical not operator, if the first expression is false the second will be true
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
