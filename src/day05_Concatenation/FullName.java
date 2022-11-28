package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firsName = "Conor";
        String lastName = "Kabih";
        int age = 35;
        String fullName =  firsName + " "+lastName;
        String jobTitle = "SDET";
        String companyName= "CYDEO";
        int salary = 100000;


        System.out.println( "Hello my name is" +firsName +lastName);
        System.out.println(fullName);

        // Full name is person is....
        System.out.println("Full name of the person is "+ fullName);

        //.... is ....years old
        System.out.println(fullName + " is " + age +" years old");

        // Full name is Job title, works at Company name and full Name' salary is

        System.out.println(fullName + " is " + jobTitle + ", " + "works at "+ companyName + " " + fullName + "'" + " salary is " + salary);
    }
}

