package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B','C', 'C', 'D', 'D', 'D'};

        char ch = chars[0];
        int frequency = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ch){
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
