package Aula01;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {

//       9. Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre.
//                No final deverá informar a média do aluno.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println("Média: "+media);
    }
}
