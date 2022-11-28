package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] classMates = {"Ali Kucuk", "Veli Buyuk", "Ceyhan Ari", "Hilal Yildiz", "Bianca Forte ", "Alice Bianchi", "Emma Volenteroso", "Claudio Morisini", "Denis Cardon"};
        for( String each: classMates){
            String reverse = "";

            for (int i = each.length()-1; i >=0; i--) {
                reverse += each.charAt(i);

            }

            System.out.println(reverse);

        }

    }
}
