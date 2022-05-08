package Aula03;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

//       4.  Escreva um programa que receba 5 números inteiros, armazene-os em um array, e imprima na tela os valores em ordem decrescente.

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i =0; i< array.length; i++){
            System.out.println("Digite um número");
            array[i] = sc.nextInt();
        }
        for(int i =array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
