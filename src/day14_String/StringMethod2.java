package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        //replace()
     String str = "Java is fun, I love learning Java";
     String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
       email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python C# C++ C++ Python Python Python Python";
        System.out.println("sentence = " + sentence);

       String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);

        String sentence3 = sentence2.replace("  ", " ");
        System.out.println("sentence3 = " + sentence3);

        String s = "Dog Dog Dog Dog Dog ";
        System.out.println("s = " + s);

        String s1 = s.replace("Dog", "Cat");
        System.out.println("s1 = " + s1);

        System.out.println("-------------------------------------------------------------");

        String St = "C# is fun, C# is cool";
        St = St.replace(" C#", " Java");
        System.out.println("St = " + St);

        String st = "Java";
        st = st.replace("a", "e"); //Jeve
        System.out.println("st = " + st);

        System.out.println("------------------------------------------------------------");

        //replaceFirst() -> it replace only the first character or word the others not

        String str4 = "Java";
        String srt5 = str4.replaceFirst("a", "e");
        System.out.println("str4 = " + str4);
        System.out.println("srt5 = " + srt5);

        String str6 = "Java Java Java"; //
        String str7 = str6.replace("Java","Python");//this will replace all Java with Python
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);

        String str8 = "Java Java Java";
        String str9 = str8.replaceFirst("Java", "Python"); //this will replace only first Java with Python
        System.out.println("str8 = " + str8);
        System.out.println("str9 = " + str9);

        String s3 = "C# is fun, C# is cool";
        s3 = s3.replaceFirst("C#", "Java");
        System.out.println("s3 = " + s3);

        String s4 = "Java";
        s4 = s4.replaceFirst("va", "vo");
        System.out.println("s4 = " + s4);









    }
}
