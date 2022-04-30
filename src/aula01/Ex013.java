package aula01;
import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {


//        13.	O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
//        Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%.
//        Escreva um programa que leia o custo de fábrica e informe o custo ao consumidor final.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o custo de fábrica do veículo: ");
        double custoFabrica = sc.nextDouble();
        double precoFinal = custoFabrica+custoFabrica*0.28+custoFabrica*0.45;
        System.out.println("O preço final do veículo é de R$"+precoFinal);

    }
}
