package aula03;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {

//        7. Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
//
//                Exemplo: Entrada usuário: 6, saída do programa: 720
//        Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        for (int i = num; i>1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);



    }
}
