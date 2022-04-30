package Aula05;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {



//   1. Calcular a quantidade de dinheiro gasta por um fumante.
//            Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Número de anos que fuma: ");
//        int anos = sc.nextInt();
//        System.out.println("Número de cigarros fumados por dia: ");
//        int cigarrosDiarios = sc.nextInt();
//        System.out.println("Preço da carteira de 20 cigarros");
//        double precoCarteira = sc.nextDouble();
//        double precoCigarro = precoCarteira/20;
//        double dinheiroGasto = (anos*365) * (cigarrosDiarios * precoCigarro);
//        System.out.println("Este fumante já gastou R$"+dinheiroGasto+" com cigarros.");

//
//    2.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende do salário bruto
//    (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
//
//    O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
//    trabalhadas no mês.
//
//            a. Desconto do IR;
//    b. Salário Bruto até R$900,00 (inclusive) – Isento;
//    c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//    d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//    e. Salário bruto acima de 2500 – Desconto de 20%.
//

//        Scanner sc = new Scanner(System.in);
//        double valorHoras;
//        int horasTrabalhadas;
//        double salarioBruto = 0;
//        double salarioLiquido = 0;
//        double impostoRenda = 0;
//        double sindicato = 0;
//        System.out.println("Digite o valor das horas:");
//        valorHoras= sc.nextDouble();
//        System.out.println("Digite a quantidade de horas trabalhadas:");
//        horasTrabalhadas = sc.nextInt();
//        salarioBruto = valorHoras * horasTrabalhadas;
//        if (salarioBruto > 2500)
//            impostoRenda = 0.2*salarioBruto;
//        else if (salarioBruto > 1500 && salarioBruto <=2500)
//            impostoRenda = 0.1*salarioBruto;
//        else if (salarioBruto > 900 && salarioBruto <=1500)
//            impostoRenda = 0.05*salarioBruto;
//
//        sindicato = salarioBruto* 0.03;
//        salarioLiquido = salarioBruto - impostoRenda - sindicato;
//        System.out.println(salarioLiquido);

//    3. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//            “Telefonou para a vítima? “
//            “Esteve no local do crime?”
//            “Mora perto da vítima? “
//            “Devia para a vítima? “
//            “Já trabalhou com a vítima? “
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice”
// e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.

//        Scanner sc = new Scanner(System.in);
//        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"};
//        String resposta ="";
//        int positivo=0;
//        for (int i  = 0; i<5; i++){
//            System.out.println(perguntas[i]);
//            resposta = sc.nextLine();
//            if (resposta.equals("Sim"))
//                positivo++;
//        }
//        if (positivo == 5)
//            System.out.println("Assasino");
//        else if (positivo > 2)
//            System.out.println("Cúmplice");
//        else if (positivo == 2)
//            System.out.println("Suspeita");
//        else
//        System.out.println("Inocente");

//
//    4. Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela e calcule a multa que uma pessoa vai receber,
//    sabendo que são pagos:
//    a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
//    b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
//    c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
//
//
//  5.  Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
//            (1) – inserir um contato
//            (2) – Remover um contato
//
//   6. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela
//   pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Coloque sua idade");
//        int idade =  sc.nextInt();
//        if (idade > 17 && idade <68)
//            System.out.println("Pode doar sangue");
//        else if (idade < 18 || idade >67)
//            System.out.println("Não pode doar sangue");
//
//
//   7. Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
//    O valor total das compras à vista
//    O valor total das compras a prazo.
//    O valor total das compras efetuadas
//    O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes

//    8. Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
//    A quantidade de pessoas com mais de 90 quilos;
//    A média das idades das sete pessoas;

//      Scanner sc = new Scanner(System.in);
//      int[] idade = new int[7];
//      int somaIdade = 0;
//      double[] peso = new double[7];
//      int pesoAcimaNoventa = 0;
//
//      for (int i = 0; i<7; i++){
//          System.out.println("Digite a idade: ");
//          idade[i] = sc.nextInt();
//          somaIdade += idade[i];
//          System.out.println("Digite o peso: ");
//          peso[i] = sc.nextDouble();
//          if (peso[i] > 90)
//              pesoAcimaNoventa++;
//      }
//      System.out.println("Média de idades = "+somaIdade/7);
//        System.out.println("Pessoas acima de 90kg: "+pesoAcimaNoventa);

//
//   9..  Faça um programa que apresente o menu de opções a seguir:
//    Menu de opções:
//            1. Média aritmética
//    2. Média ponderada
//    Digite a opção desejada:
//    Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//    Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//    Verifique a possibilidade de opção inválida, mostrando uma mensagem.

//    10.Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme:
//
//            3 - ótimo,
//            2 - bom,
//            1 - regular
//
//     Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
//
//
//    A média das idades das pessoas que responderam ótimo;
//    A quantidade de pessoas que respondeu regular;
//    A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
    }
}
