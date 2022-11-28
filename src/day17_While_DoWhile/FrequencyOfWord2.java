package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Cat Cat Dog Dog caT cAt ";
        int frequency = 0;

        for (int i = 0; i < sentence.length()-3; i++) {
            String eachSub = sentence.substring(i, i+3);
            //System.out.println(eachSub);

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }

        }
        System.out.println(frequency);


    }
}
