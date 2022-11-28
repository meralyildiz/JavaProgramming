package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";
        String result = ""; //abc

        for (int i = 0; i <= str.length() - 1; i++) { // i: represents all the index numbers of str starting from 0
            String ch = "" + str.charAt(i); // represents all characters of str

            if (!result.contains(ch)) {  // if the character is not contained in the result
                result += ch; // the character will be addes to the result
            }

        }
        System.out.println(result);

        System.out.println("----------------------------------------------------");

        String sentence = "JJCC";
        String result2 = "";

        for (int i = 0; i <= sentence.length()-1; i++) {
            String ch2 = "" +sentence.charAt(i);

            if ( !result2.contains(ch2)) {
                result2 += ch2;
            }

        }
        System.out.println(result2);

        System.out.println("---------------------------------------------------------");

        String duplicate = "JJaaBBccDD";
        String result3 = "";

        for (int i = 0; i<=duplicate.length()-1; i++ ){
            String ch3 = ""+duplicate.charAt(i);

            if( !result3.contains(ch3)){
                result3 += ch3;

            }
        }
        System.out.println(result3);

        System.out.println("-----------------------------------------------------");

        String s = "evevevev";
        String result4 = "";

        for(int i = 0; i <= s.length()-1; i++){
            String ch4 = ""+s.charAt(i);

            if(!result4.contains(ch4)){
                result4 += ch4;
            }
        }
        System.out.println(result4);
    }



}

