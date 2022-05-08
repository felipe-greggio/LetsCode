package Aula03;
import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {

//       11. Escreva um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo compreendido entre eles.
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("digite o segundo número");
        int num2 = sc.nextInt();
        for (int i = num1+1; i<num2; i++)
            System.out.println(i);

    }
}
