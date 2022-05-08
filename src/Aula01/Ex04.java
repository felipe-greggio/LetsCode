package Aula01;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        //4.	Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.println("Esta pessoa já viveu "+ (idade*365)+ " dias");
    }
}
