package aula01;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

//        3.	Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
//        o	 o valor da variável de quanto a pessoa quer emprestado;
//        o	em quantos meses ela irá pagar
//	A taxa de juros será de 2% ao mês
//	Fórmula: M = C * (1+i)^t
//•	M = valor final após a aplicação dos juros
//•	C = valor que a pessoa vai pegar emprestado
//•	i é a taxa de juros
//•	t é o tempo
//        o	Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();
        System.out.println("Digite em quantos meses será pago o empréstimo: ");
        int meses = sc.nextInt();
        double valorFinal = emprestimo*Math.pow(1+0.02,meses);
        System.out.printf("Valor total a ser pago: %.2f", valorFinal);
    }
}
