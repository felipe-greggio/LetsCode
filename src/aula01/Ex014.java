package aula01;
import java.util.Scanner;
public class Ex014 {
    public static void main(String[] args) {


//        14.	Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
//        o	Cálculo:  área = PI * (raio²)
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio do círculo: ");
        double raio = sc.nextDouble();
        System.out.println("Área do círculo = "+raio*Math.PI);

    }
}
