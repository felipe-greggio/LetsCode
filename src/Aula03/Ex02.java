package Aula03;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

//        2. Faça um programa que leia um número inteiro diferente de zero e mostre uma mensagem indicando se este número é positivo ou negativo.
//        Pare a execução do programa quando o usuário requisitar (O programa deve parar quando o usuário escolher 0).

        Scanner sc = new Scanner(System.in);
        int num=1;
        while (num != 0){
            System.out.println("Digite um número (digite 0 para sair do programa): ");
            num = sc.nextInt();
            if (num<0)
                System.out.println("Número negativo");
            else if (num >0)
                System.out.println("Número positivo");
        }
        System.out.println("Fim do programa");
    }
}
