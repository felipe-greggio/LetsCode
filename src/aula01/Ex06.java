package aula01;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        //    6.	Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
//    o	Dólar
//    o	Euro
//    o	Libra
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a cotação do dólar do dia: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("informe a cotação do Euro do dia: ");
        double cotacaoEuro = sc.nextDouble();
        System.out.println("informe a cotação da Libra do dia: ");
        double cotacaoLibra= sc.nextDouble();
        System.out.println("informe um valor em reais: ");
        double valorReais = sc.nextDouble();
        System.out.printf("considerando o câmbio do dia, a quantia de R$%.2f corresponde à quantia de $%.2f dólares, $%.2f Euros e $%.2f Libras.", valorReais, (valorReais/cotacaoDolar), (valorReais/cotacaoEuro), (valorReais/cotacaoLibra));

    }
}
