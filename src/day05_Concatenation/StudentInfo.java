package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        /*
        2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)

         */

        String name = "Maria";
        int age = 33;
        char gender = 'F';
        String school_Name = "Galileo Galilei";
        String phone_number = " (0039)3338884563";
        boolean full_time = true;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_Name = " + school_Name);
        System.out.println("phone_number = " + phone_number);
        System.out.println("full_time = " + full_time);

    }
}
