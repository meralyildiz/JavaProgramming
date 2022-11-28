package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {
        //trim() method -> this method is used to leave/cut the white spaces
        String str1 = "       batch 25    ";
        str1 = str1.trim();

        System.out.println("str1 = " + str1);

        System.out.println ("-------------------------------------");
        // indexOf() AND lastIndexOf()

        String str2 = "Cydeo School";
        int n1= str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2= str2.indexOf("o");
        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("oo");
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming Language";
        int n4 = str3.indexOf("a"); //index number of the first "a" in the text
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("a "); // index number of the second "a" in the text
        System.out.println("n5 = " + n5);

        int n6 = str3.indexOf("amm"); // index number of the third "a" in the text
        System.out.println("n6 = " + n6);

        int n7 = str3.indexOf("an");//index number of  the fourth "a" in the text
        System.out.println("n7 = " + n7);

        int n8 =str3.lastIndexOf("g");
        System.out.println("n8 = " + n8);

        String s = "Java Nova Canva Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        // int fourthA = s.indexOf("an");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca")+1 ; //indexOf() start reading from the left to the right
        System.out.println("fourthA = " + fourthA);

        int fifthA = s.lastIndexOf("a W");//lastIndexOf() start reading from the right to the left
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int seventhA = s.indexOf("a o");
        System.out.println("seventhA = " + seventhA);





    }

}
