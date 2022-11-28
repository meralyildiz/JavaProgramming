package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = " ";//it returns if the place is empty, space is considered as character, so it is not empty
        boolean r =str.isEmpty();

        System.out.println(r);


        String str2 = " ";
        boolean r2 = str2.isBlank(); // it returns if there is white spaces in the object
        System.out.println(r2);

        System.out.println("--------------------------------------");

        String s = "CYDEO";

        String s2 = "cydeo";

        System.out.println(s.equals(s2)); //false
        System.out.println(s.equalsIgnoreCase(s2)); //true, because it ignores the case sensitivity

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("---------------------------------------------");
        String sentence = "My favourite programming is Java";

        boolean hasCSharp =  sentence.contains("C#");
        System.out.println(hasCSharp);

        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);

        boolean hasJava2 = sentence.contains("java");
        System.out.println(hasJava2);

        boolean hasJava3 = sentence.toLowerCase().contains("java"); //this is to manipulate the case sensitivity
        System.out.println(hasJava3);

        System.out.println("---------------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//true

        System.out.println(input1.toLowerCase().contains("java"));//true -> these are the methods to ignore the case sensitivity
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("---------------------------------------------------");
        //startsWith()  - endsWith()
        String a = "Wooden Spoon";
        boolean x =  a.startsWith("W"); //true
        System.out.println(x);

        boolean x1 = (a.toLowerCase().contains("spoon")); //true
        System.out.println(x1);

        boolean x2 = a.toLowerCase().endsWith("spoon"); //true
        System.out.println(x2);





    }
}
