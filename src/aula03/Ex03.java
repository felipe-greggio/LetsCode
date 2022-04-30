package aula03;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

//               3. Escreva um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: “Múltiplo de 10”.

        Scanner sc = new Scanner(System.in);
        int i=1;
        while (i<101) {
            System.out.println(i);
            if (i % 10 == 0)
                System.out.println("Múltiplo de 10");
            i++;
        }

    }
}
