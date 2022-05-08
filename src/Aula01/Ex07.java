package Aula01;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {


//        7.	Crie um programa que receba 2 números e ao final mostre as seguintes operações:
//        o	Soma
//        o	Subtração
//        o	Multiplicação
//        o	Divisão
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int num2 = sc.nextInt();
        System.out.printf("Soma: %d\n" +
                "Subtração: %d\n" +
                "Multiplicação: %d\n" +
                "Divisão: %d", (num1 + num2), (num1 - num2), (num1 * num2), (num1/num2));

    }
}
