package Aula01;
import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {

//        12.	Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
//                O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço de custo do produto: ");
        double precoCusto = sc.nextDouble();
        System.out.println("Insira o percentual de margem de venda: ");
        double percentual = sc.nextDouble();
        System.out.println("Valor de venda do produto: R$"+ (precoCusto+precoCusto*percentual));
    }
}
