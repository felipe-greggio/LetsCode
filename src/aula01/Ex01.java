package aula01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.	Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados conforme as fórmulas abaixo:
//        o	Kelvin
//	K = Celsius + 273.15;
//        o	Fahrenheit
//	F = Celsius * 1.8 + 32;
//        o	Rankine
//	Ra = Celsius * 1.8 + 32 + 459.67
//        o	Réaumur
//	Re = Celsius * 0.8;

//

        System.out.println("Digite a temperatura em graus celsius:");
        double celsius = sc.nextDouble();
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        double reaumur =   celsius * 0.8;
        System.out.println("Kelvin: "+kelvin+"\nFahrenheit: "+fahrenheit+"\nRéaumur: "+reaumur);

    }
}
