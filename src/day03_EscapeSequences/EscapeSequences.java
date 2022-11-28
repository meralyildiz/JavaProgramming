package day03_EscapeSequences;

public class EscapeSequences {
    /*
    escape sequences: MUST be given with double quote
            \n:start new line

            \t: (horizontal) tab, paragraph space (it must be used within double quote)
            \\: prints one/single back slash
            \":


     */

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC");

        System.out.println("---------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all! \nWhat class dowe have next week");


        System.out.println("---------------------------");
        System.out.println("\tJava is Cool Programming Language");

        System.out.println("----------------------------");
        System.out.println("/ \\\\"); // in order to print two backward slashes we need to give 4 backward slashes

        System.out.println("----------------------------");

        System.out.println("My favourite TV Show is \"Game of Thrones\""); //in order to print double quotes, we need to
    }


}
