import java.util.Scanner;
public class Revisao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("Informe a nota do aluno: ");
            nota = scanner.nextDouble();
            if (nota >= 7) {
                System.out.println("Aprovado.");                
            }else{
                System.out.println("Reprovado.");
            }
            scanner.close();
    }    
}
