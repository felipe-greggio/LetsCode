package Aula02;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {


//    1.    Escreva um programa que seja capaz de receber as seguintes informações e calcular a média da nota de um aluno:
//    Nome
//            Turma
//    Nota 1
//    Nota 2
//    Nota 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:");
        String name = sc.nextLine();
        System.out.println("Informe a turma do aluno:");
        String classroom = sc.nextLine();
        System.out.println("Informe a nota 1:");
        double mark1 = sc.nextDouble();
        System.out.println("Informe a nota 2:");
        double mark2 = sc.nextDouble();
        System.out.println("Informe a nota 3:");
        double mark3 = sc.nextDouble();
        System.out.printf("A média do aluno %s foi de %.2f", name, (mark1+mark2+mark3)/3);












    }

}
