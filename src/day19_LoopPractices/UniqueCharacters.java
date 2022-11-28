package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; //represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the characters that outer loop picjed, with each character
                char each = str.charAt(i);
                if (ch == each) {
                    count++;

                }
            }
            if (count == 1) { //if the frequency of the character is one, then the character is unique
                result += ch;
            }

    /*        if(count != 1){
                continue;
            }
            result += ch; ==> this is another way to declare if the character is occurred once so it is unique
    */


        }
        System.out.println(result);
    }
}

/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */
