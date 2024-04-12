import java.util.Scanner;
public class Revisao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Escreva 3 números: ");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();
        scanner.close();
        double maior = Math.max(n1,Math.max(n2, n3));
        System.out.println("O maior número é: "+maior);
        
    }
    
}
