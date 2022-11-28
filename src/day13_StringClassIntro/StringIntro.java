package day13_StringClassIntro;

// import java.lang.String -> this class will be imported automatically by the compiler , there is no need to do it manually

public class StringIntro {
    public static void main(String[] args) {
    // STRING LITERAL is that way to create a new String method using "" --> it will be collocated in to the String pool and it doesn't accept two same data
        //for ex str1"Java" - str2"Java" it will be stored just once into the String Pool
        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        System.out.println("----------------------------------------------------------");
        //CREATING STRING BY NEW KEYWORD
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str2 == str1);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println("----------------------------------------------------------------");
        // this way doesn't compare the string object but the sequence of the character
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = "java";

        System.out.println(s3.equals(s4));

        System.out.println("--------------------------------------------");
        String s5 = new String("Java");
        String s6 = new String("Java");

        System.out.println(s5.equals(s6)); //equal compare just the tax if they are same or not
        System.out.println(s5 == s6); // this compares the object s5 and s6, they are in the heap and saved separately, so they are not the same object

    }
}
