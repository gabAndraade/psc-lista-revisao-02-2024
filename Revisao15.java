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
        if (salario <= 1903.98) {
            return 0;            
        }else if(salario<=2826.65){
            return(salario - 1903.98)*0.075;
        }else if(salario <=3751.05){
            return(salario - 2826.65)*0.15 +69.36;
        }else if(salario<= 4664.68){
            return (salario - 3751.05)*0.225 +352.80;
        } else {
            return (salario - 4664.68)*0.275 +636.13;
        }
        
    }
    
}
