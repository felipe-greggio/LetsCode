package Aula03;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

//        5. Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC, o resultado irá dizer se a pessoa está:
//        abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9), com excesso de peso (IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC),
//        informe cada um deles com uma mensagem.
//
//                Use a fórmula: IMC = Peso ÷ (Altura × Altura)

        Scanner sc = new Scanner(System.in);
        double height;
        double weight ;
        double imc;
        System.out.println("Digite a altura (m) : ");
        height = sc.nextDouble();
        System.out.println("Digite o peso (kg): ");
        weight = sc.nextDouble();
        imc = weight/Math.pow(height, 2);
        System.out.printf("IMC: %.1f ", imc);

        if (imc < 18.5 )
            System.out.println("Abaixo do peso normal");
        else if (imc> 18.5 && imc < 25.0)
            System.out.println("Peso normal");
        else if( imc >= 25.0 && imc < 30.0)
            System.out.println("Excesso de peso");
        else
            System.out.println("Pessoa obesa");


    }
}
