package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
         String[] classMates = {"Ali Kucuk", "Veli Buyuk", "Ceyhan Ari", "Hilal Yildiz", "Bianca Forte ", "Alice Bianchi", "Emma Volenteroso", "Claudio Morisini", "Denis Cardon"};

         for( String each : classMates){
             String initial = each.charAt(0) + "."+each.charAt( each.indexOf(" ")+1 );
             System.out.println(initial);

        }
    }
}
