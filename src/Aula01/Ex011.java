package Aula01;
import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {


        //11.	Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça um programa que insira o valor total de uma compra e o valor das prestações.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor total de compra: ");
        double valorCompra = sc.nextDouble();
        System.out.println("Valor das prestações: 5 prestações de R$"+ valorCompra/5);
    }
}
