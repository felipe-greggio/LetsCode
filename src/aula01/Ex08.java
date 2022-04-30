package aula01;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {


//        8. Escreva um programa em java para definir o consumo médio de um automóvel
//        sendo fornecido a distância total percorrida pelo automóvel e o total de combustível gasto (litros).
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a distância total percorrida pelo automóvel (Kilômetros): ");
        double distancia = sc.nextDouble();
        System.out.println("informe o total de combustível gasto (Litros): ");
        double litros = sc.nextDouble();
        double consumoMedio = distancia/litros;
        System.out.println("O consumo médio do veículo foi de "+consumoMedio+" Km/L");
    }
}
