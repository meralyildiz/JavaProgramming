package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //subString( beginning index, ending index) method -> creating subvalue


    String str1 =  "Cydeo School"; // when you we give the index like 0-4 it gets till 3, 4 is not included
    //              0123456789...
    String brand = str1.substring(0, 4+1);
    System.out.println("brand = " + brand);

   String str2 = str1.substring(6);
   System.out.println("str2 = " + str2);

   String word = "Java Programming Language";
   String s1 = word.substring(0, word.indexOf(" ")); //"Java"
   String s2 = word.substring(word.indexOf(" ")+1, word.lastIndexOf(" ")) ; //"Programming"
   String s3 = word.substring( word.lastIndexOf(" ")+1); //"Language"

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}