import java.util.Scanner;
public class Revisao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Menor de idade");            
        }else{
            System.out.println("Maior de idade");
        }
        scanner.close();
    }
}
