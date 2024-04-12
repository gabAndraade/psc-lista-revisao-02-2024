import java.util.Scanner;
public class Revisao8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextDouble();
        if (numero %2==0) {
            System.out.println("É um número par.");    
        }else{
            System.out.println("É um número ímpar.");
        }
        scanner.close();
    }
}