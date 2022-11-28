package day09_IfElse_MultiBranchIf;

public class MaximumMinimumEligible {
    public static void main(String[] args) {
        int x = 150;
        int y = 200;
        if(x>y){
            System.out.println(x+ " is the maximum number");
        } else{
            System.out.println(y + " is the maximum number");
        }

        if (x<y) {
            System.out.println(x + " is the minimum number");
        }   else{
            System.out.println( y + " is the minimum number");
        }

        System.out.println("------------------------------------------------------------");
        String name = "Daniel";
        int age = 25;

        if (age <18){
            System.out.println(name+ " is eligible to buy alcoholic drink");
        } else{
            System.out.println( name + " is not eligible to buy alcoholic drink");
        }

        System.out.println("-----------------------------------------------------------------");





    }

}
