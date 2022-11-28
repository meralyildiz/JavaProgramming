package day16_ForLoopStringPractice;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aacccd";
        String result= "";

            //          0   ==            1
       for(int i = 0; i < str.length(); i++) { // ch: each characters of str
           char ch = str.charAt(i);
           if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are same
               result += ch;
           }
       }
        System.out.println(result);
    }
}
/*
Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */