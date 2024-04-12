import java.util.Scanner;
public class Revisao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o preço do produto: ");
            double precoOG = scanner.nextDouble();
        System.out.println("Desconto de: ");
            double desconto = scanner.nextDouble();

        double valorDesconto = (desconto/100)*precoOG;
        double novoPreco = precoOG-valorDesconto;

        System.out.println("O preço do produto com desconto é: "+novoPreco);
        scanner.close();   
    }
    
}
