package aula02;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {



//5. Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma viagem, sabendo-se que o carro faz 12 Km com um litro.
// Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
//
//    utilizar as seguintes fórmulas:
//    distância = tempo x velocidade
//    litros usados = distância / 12

        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça o tempo gasto na viagem");
        double time = sc.nextDouble();
        System.out.println("Qual será a velocidade média?");
        double averageSpeed = sc.nextDouble();
        double distance = time * averageSpeed;
        System.out.printf("A quantidade de litros de combustível necessária para se fazer esta viagem é de %.2fL", distance/12);
    }
}
