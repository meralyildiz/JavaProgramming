package day16_ForLoopStringPractice;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {9,2,6,4,5,3};

        int[] reversed = new int[arr.length];
        Arrays.sort(arr);

        for(int i =arr.length -1, j=0; i>=0; i--, j++){
            reversed[j] = arr[i];

        }
        System.out.println(Arrays.toString(reversed));
    }
}
