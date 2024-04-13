import java.util.Scanner;
import java.util.Random;
public class Revisao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        while(true){
            System.out.println("Jogo: Pedra, papel e tesoura.");
            System.out.println("Digite '1' para pedra, '2' para papel, '3' para tesoura, caso queira sair digite '4'.");
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 4) {
                System.out.println("Encerrando...");
                break;
                
            }
            int escolhaPC = random.nextInt(3)+1;
            String jogadaPC = opcoes[escolhaPC];
            System.out.println("O computador escolheu: "+jogadaPC);
            if (escolhaJogador == 1 && jogadaPC.equals("Pedra")) {
                System.out.println("Empate");               
            }
            if(escolhaJogador == 1 && jogadaPC.equals("Tesoura")){
                System.out.println("Você ganhou!!!");
            }
            if(escolhaJogador == 2 && jogadaPC.equals("Pedra")){
                System.out.println("Você ganhou!!!");
            }
            if(escolhaJogador == 3 && jogadaPC.equals("Papel")){
                System.out.println("Você ganhou!!!");
            }else{
                System.out.println("Você perdeu!");
            }
        }
        scanner.close();

    }
    
}
