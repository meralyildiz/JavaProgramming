package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo", "Wooden Spon", "Early Bird", "Angry Birds"};
        String print = words[0];

        for( String each :words){
            System.out.println(each.charAt(0) + ""+ each.charAt(each.length()-1));
        }




    }
}
