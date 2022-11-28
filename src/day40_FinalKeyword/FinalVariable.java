package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static{
        name = "Batch 25";
    }

    FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args){

        final double pi = 3.14;

        // pi= 4.15;//Cannot assign a value to final variable 'pi' because we have given final to the method
        // pi = 5.50;

        final String name;
        name = "Java";
        // name= " Wooden Spoon";

        System.out.println("-------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        // obj.birthday = "June/01"; //final variables can not beb reassigned
        System.out.println(obj.birthday);

        System.out.println("-----------------------------------");
       // FinalVariable.name="Python";
        System.out.println(FinalVariable.name);




    }
}
