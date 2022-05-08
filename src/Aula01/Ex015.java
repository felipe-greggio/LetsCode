package Aula01;
import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) {


//
//        15.	Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados para um haras.
//        A informação de cavalos comprados deve ser informada pelo usuário.
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos cavalos serão comprados: ");
        int quantidadeCavalos = sc.nextInt();
        int quantidadeFerraduras = quantidadeCavalos*4;
        System.out.println("Serão necessário comprar "+quantidadeFerraduras+" ferraduras para "+quantidadeCavalos+ " cavalos.");


    }
}
