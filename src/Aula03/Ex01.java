package Aula03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {


//      1.  Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem informando
//      se o aluno foi aprovado caso apresente o valor da média escolar maior ou igual a 7.
//      Caso contrário, apresente uma mensagem informando que ele está de recuperação.

        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media;
        for (int i = 0; i<4; i++){
            System.out.println("Digite a nota do aluno: ");
            nota += sc.nextDouble();
        }
        media = nota/4;
        if (media< 7.0){
            System.out.println("O aluno está de recuperação. Média: "+media);
        }
        else{
            System.out.println("O aluno foi aprovado. Média: "+media);
        }
    }
}
