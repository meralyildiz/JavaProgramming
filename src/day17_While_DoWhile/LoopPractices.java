package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //repeat from 1-10
            System.out.println(i + "for");

        }
        System.out.println("---------------------------------------------------");
        int j =1;

        while (j <= 10){
            System.out.println(j + "while");
            j++;
        }
        int k = 1;

        do {
            System.out.println(k + "do while");
            k++;

        }while (k <= 10);

    }
}
