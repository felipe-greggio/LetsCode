package Aula03;
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {

        // 10. Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número correto,
//                você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou menor do que o informado,
//                caso ele erre três vezes o programa se encerra e imprime uma mensagem informando que ele perdeu.
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int min = 1;
        int max = 10;
        int chute;

        int num = (int)Math.floor(Math.random()*(max-min+1)+min);

        while (tentativas <3){
            System.out.println("Chute um número");
            chute = sc.nextInt();
            if (chute== num) {
                System.out.println("Parabéns, você acertou");
                break;
            }
            else if (chute < num)
                System.out.println("O número que você chutou é muito baixo!");
            else
                System.out.println("O número que você chutou é muito alto!");
            tentativas++;
        }
            if (tentativas==3)
                System.out.println("Você perdeu");

    }
}
