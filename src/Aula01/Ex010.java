package Aula01;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {


//        10.	Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
//            Considere a taxa de juros da poupança em 0,70% a.m.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a depositar: ");
        double deposito = sc.nextDouble();
        System.out.println("Valor após rendimento de um mês: "+ deposito*1.0070);

    }
}
