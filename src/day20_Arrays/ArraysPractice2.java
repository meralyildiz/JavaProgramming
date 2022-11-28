package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];

/*        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++) {
            letters[j] = i;

        }
 */
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;

        }
        System.out.println(Arrays.toString(letters)); //a-z


        System.out.println("----------------------------------------------------------");

        char[] letters2 = new char[26]; //Z-A


       char ch2 = 'Z';
        for (int k = letters.length; k <= 0; k--) {
                letters2[k] = ch--;
        }


            System.out.println(Arrays.toString(letters2));

        }

    }

