package Aula01;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        // 2.	Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma altura de “h” em “t” segundos.
        //                o	Considere cavalos = (m * h / t ) / 745,6999
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a massa: ");
        double massa = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o tempo em segundos: ");
        double tempo = sc.nextDouble();
        double quantidadeCavalos = (massa*altura/tempo)/ 745.6999;
        System.out.println(quantidadeCavalos);

    }
}
