package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
      String str = "Wooden Spoon";
      //index number0123456789

      String result = ""; //contain the reversed version of str
        //noopS nedooW
        /*
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //s
        result += str.charAt(6); //' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //w

         */

        for( int i = str.length()-1; i >= 0; i--){ //i: index numbers of str (starting last index to index 0)
            result +=  str.charAt(i);
        }

        System.out.println("-------------------------------------------------------");
        String word = "Java is fun";
        String  result1 = "";

        for(int i = word.length()-1; i >= 0; i--){
            result1 += word.charAt(i);
        }
        System.out.println(result1);



        System.out.println(result);

        System.out.println("------------------------------------------------------");

        String fullName = "Meral Yildiz";
        String result2 = "";

        for (int i = fullName.length()-1; i >= 0; i--){
           result2 += fullName.charAt(i);
        }
        System.out.println(result2);

        System.out.println("-----------------------------------------------");

        String sentence = "I love Java, Java is fun programming language";
        String result3 = "";

        for(int i = sentence.length()-1; i >= 0; i-- ){
            result3 += sentence.charAt(i);

        }
        System.out.println(result3);

    }
}
/*
Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


 */