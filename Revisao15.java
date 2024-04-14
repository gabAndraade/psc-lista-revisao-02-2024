import java.util.Scanner;
public class Revisao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário do funcionário:");
            double salario = scanner.nextDouble();
            double imposto = calculoIR(salario);
        System.out.println("O imposto de renda que deve ser pago é: "+imposto);
        scanner.close();
    }
    public static double calculoIR(double salario){
        if (salario <= 2259.20) {
            System.out.println("Isento");
            return 0;            
        }else if(salario<=2828.65){
            return(salario - 2259.20)*0.075;
        }else if(salario <=3751.05){
            return(salario - 2828.65)*0.15;
        }else if(salario<= 4664.68){
            return (salario - 3751.05)*0.225;
        } else {
            return (salario - 4664.68)*0.275;
        }
        
    }
    
}
