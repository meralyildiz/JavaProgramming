package day14_String;

public class StringMethod4 {
    public static void main(String[] args){
        String str = "Cydeo";
        String str2 = str.repeat(4);
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2); //CydeoCydeoCydeoCydeo


        String s1 = "Wooden Spoon ";
       s1= s1.repeat(10);
        System.out.println("s1 = " + s1);

        System.out.println("----------------------------------------------------------------");
        System.out.println("FADY".repeat(5));// this is just to print tome word without assigning anything

        System.out.println("FADY\n".repeat(15)); // this is to print 15  times in each line


    }
}
