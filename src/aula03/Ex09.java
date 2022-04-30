package aula03;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        //
//                9. Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.
//


        Scanner sc = new Scanner(System.in);
        int idade;
        int qtde=0;

        for(int i =0; i<10; i++){
            System.out.println("Digite a idade da pessoa "+(i+1));
            idade = sc.nextInt();
            if (idade>= 18)
                qtde++;
        }
        System.out.println("Pessoas maiores de 18: "+ qtde);
    }
}
