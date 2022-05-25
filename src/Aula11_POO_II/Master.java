package Aula11_POO_II;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Master {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        double number1;
        double number2;
        Sum sum = new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();


        while(choice != 9){
            System.out.println();
            System.out.println("Choose the operation :\n1-Sum\n2-Subtraction\n3-Multiplication\n4-Division\n9-Exit program");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("First Number:");
                    number1 = scan.nextDouble();
                    System.out.println("Second Number:");
                    number2 = scan.nextDouble();
                    System.out.println("Result = "+sum.execute(number1,number2));
                    break;
                case 2:
                    System.out.println("First Number:");
                    number1 = scan.nextDouble();
                    System.out.println("Second Number:");
                    number2 = scan.nextDouble();
                    System.out.println("Result = "+subtraction.execute(number1,number2));
                    break;
                case 3:
                    System.out.println("First Number:");
                    number1 = scan.nextDouble();
                    System.out.println("Second Number:");
                    number2 = scan.nextDouble();
                    System.out.println("Result = "+multiplication.execute(number1,number2));
                    break;
                case 4:
                    System.out.println("First Number:");
                    number1 = scan.nextDouble();
                    System.out.println("Second Number:");
                    number2 = scan.nextDouble();
                    System.out.println("Result = "+git division.execute(number1,number2));
                    break;
                default:
                    break;
            }
        }
        System.out.println("End of program");

    }

}
