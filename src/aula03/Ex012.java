package aula03;
import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {

//      12.  Escreva um programa que leia e valide as seguintes informações:
//        Nome: maior que 3 caracteres;
//        Idade: entre 0 e 150
//        Salário: maior que 0
//        Sexo: ‘f’ ou ‘m’
//        Estado civil: ‘s’, ‘c’, ‘v’, ‘d’

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite um nome");
        nome = sc.nextLine();
        if (nome.length()<3)
            System.out.println("nome inválido");

        System.out.println("Digite a idade");
        idade = sc.nextInt();
        if (idade <0 || idade>150)
            System.out.println("Idade inválida");

        System.out.println("Digite o salário");
        salario = sc.nextDouble();
        sc.nextLine();
        if (salario < 0)
            System.out.println("Salário inválido");

        System.out.println("Digite o sexo");
        sexo = sc.nextLine();
        if (!sexo.equals("f") && !sexo.equals("m"))
            System.out.println("sexo inválido");

        System.out.println("Digite o estado civil");
        estadoCivil = sc.nextLine();
        if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"))
            System.out.println("Estado Civil inválido");
    }
}
