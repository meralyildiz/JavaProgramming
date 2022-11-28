package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
         String word = "Level";
         String reversed = "";

         for(int i = word.length()-1; i >= 0; i--){
            reversed +=  word.charAt(i);

         }
         boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println(isPalindrome);

        System.out.println("----------------------------------------");

        String word2 = "Anna";
        String reversed2 = "";

        for(int i = word2.length()-1; i >=0; i--){
            reversed2 += word2.charAt(i);
        }
        boolean isPolindrome2 = reversed2.equalsIgnoreCase(word2);
        System.out.println(isPolindrome2);
    }
}
/*
"Java" ==> "avaJ" ===> false(not palindrome)
"Anna" ==> "annA" ===> true
"Level" ==> "leveL" ==> true
 */
