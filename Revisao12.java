import java.util.Scanner;
public class Revisao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
            String word = scanner.nextLine();
            if (palindromo(word)) {
                System.out.println("Essa palavra é um palíndromo.");
            }else{
                System.out.println("Essa palavra não é um palíndromo.");
            }
            scanner.close();
        }
        public static boolean palindromo(String str){
            return str.equals(new StringBuilder(str).reverse().toString());
            
    }    
}
