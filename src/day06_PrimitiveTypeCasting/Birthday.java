package day06_PrimitiveTypeCasting;

public class Birthday {
    public static void main(String[] args) {

    String name = "Maria Mercedes";
    int birthDay = 30;
    String month = "May";
    int birthYear = 1988;
    String fullBirthday =  month + " " + birthDay + " " + birthDay;

        System.out.println( name + " was born on " + month+ "/" + birthDay + "/" + birthYear + ".");


        //My favourite book is "bookName"
        String bookName = "The Little Prince";

        System.out.println("My favourite book is " +  "\"" +bookName + "\"");
    }
}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */