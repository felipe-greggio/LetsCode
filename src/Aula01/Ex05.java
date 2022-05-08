package Aula01;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        //5.	Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7% e mostra o valor antes do reajuste e após.
        Scanner sc = new Scanner(System.in);
        double salario = 1700.00;
        double reajuste = salario*1.07;
        System.out.println("Salário anterior: "+ salario+ "\nSalário após reajuste: "+ reajuste);
    }
}
