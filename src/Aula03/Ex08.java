package Aula03;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

//       8.  Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor, o menor valor e calcule a média dos números lidos e
//       exiba essas informações.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int maior = sc.nextInt();
        int menor = maior;
        int num;
        int soma = 0;
        for(int i =0; i<9; i++){
            System.out.println("Digite um número");
            num = sc.nextInt();
            if (num>maior)
                maior = num;
            else if (num < menor)
                menor = num;
            soma += num;
        }
        System.out.println("Maior: "+maior+" Menor: "+menor+ " Média: "+soma/10);


    }
}
