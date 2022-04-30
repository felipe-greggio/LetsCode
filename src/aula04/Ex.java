package aula04;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Ex {

    public static void main(String[] args) {

//        1. Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;
//        (Você pode utilizar a biblioteca Random: https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/ )


//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        double[] randomArray = new double[10];
//        for (int i =0; i<10; i++){
//            randomArray[i] = random.nextDouble()*100;
//        }
//        for (double j : randomArray)
//            System.out.println(j);


//     2.   Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5.


//        Scanner sc = new Scanner(System.in);
//        double[][] matrix = new double[2][5];
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<5; j++){
//                System.out.println("Insira um número");
//                matrix[i][j] = sc.nextDouble();
//            }
//        }
//        for (int i =0; i<2; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//     3.  Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.

//        Scanner sc = new Scanner(System.in);
//        double[][] matrix = new double[2][2];
//
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<2; j++){
//                System.out.println("Insira um número");
//                matrix[i][j] = sc.nextDouble();
//            }
//        }
//        double maior = matrix[0][0];
//        for (int i =0; i<2; i++) {
//            for (int j = 0; j < 2; j++) {
//                if (matrix[i][j] > maior)
//                    maior = matrix[i][j];
//            }
//        }
//        System.out.println(maior);


//        4. Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.


//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[2][2];
//        int soma = 0;
//
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<2; j++){
//                System.out.println("Insira um número");
//                matrix[i][j] = sc.nextInt();
//                soma +=matrix[i][j];
//            }
//        }
//        System.out.println(soma);

//           5.     Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica uma de suas linhas, e retorna a média dos valores daquela linha

//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[2][2];
//        int linha;
//        double soma = 0;
//
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<2; j++){
//                System.out.println("Insira um número");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Indique a linha que quer descobrir a média");
//        linha = sc.nextInt();
//        for(int i = 0; i<matrix[linha-1].length; i++){
//            soma += matrix[linha-1][i];
//
//        }
//        System.out.println("Média = "+soma/matrix[linha-1].length);


//  6.      Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria esportiva,
//  contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador, o número do seu cartão e um vetor de Respostas de 13 posições.
//  Verifique para cada apostador o números de acertos, comparando o vetor de Gabarito com o vetor de Respostas.
//  Escreva o número do apostador e o número de acertos. Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".

//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        int[] gabarito = new int[13];
//        int[] apostador1 = new int[14];
//        int[] apostador2 = new int[14];
//        int acerto1 = 0;
//        int acerto2 = 0;
//        apostador1[0] = 101;
//        apostador2[0] = 102;
//        for (int i = 0; i< gabarito.length; i++){
//            gabarito[i] = random.nextInt(3)+1;
//            apostador1[i+1] = random.nextInt(3)+1;
//            apostador2[i+1] = random.nextInt(3)+1;
//        }
//        for (int i = 0; i< gabarito.length; i++){
//            System.out.print (apostador1[i+1]+" ");
//            if (apostador1[i+1] == gabarito[i]){
//                acerto1++;
//            }
//            else if (apostador2[i+1] == gabarito[i]){
//                acerto2++;
//            }
//        }
//        System.out.println(" O jogador "+apostador1[0]+ " fez "+acerto1+" acertos");
//        System.out.println(" O jogador "+apostador2[0]+ " fez "+acerto2+" acertos");
//        if (acerto1 ==13)
//            System.out.println(" O jogador "+apostador1[0]+ "é o ganhador");
//        else if (acerto2 ==13)
//            System.out.println(" O jogador "+apostador2[0]+ "é o ganhador");

//                7. Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova.
//                A seguir, para cada um dos 10 alunos da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos.
//                Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6;
//                e mostre uma mensagem de REPROVADO, caso contrário.

//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        char[] gabarito = new char[10];
//        char[][] alunosRespostas = new char[10][10];
//        int[] acertos = new int[10];
//        for (int i = 0; i <gabarito.length; i++){
//            gabarito[i] = (char)(random.nextInt(4) + 'a');
//            for (int j =0; j< gabarito.length; j++){
//                alunosRespostas[i][j] = (char)(random.nextInt(4) + 'a');
//            }
//        }
//        for (int i =0; i< gabarito.length; i++){
//            for (int j = 0; j < gabarito.length; j++){
//                if (alunosRespostas[i][j] == gabarito[j])
//                    acertos[i]++;
//            }
//            if (acertos[i]>=6)
//                System.out.println("O aluno "+(i+1)+" está APROVADO, com nota "+acertos[i]);
//            else
//                System.out.println("O aluno "+(i+1)+" está REPROVADO, com nota "+acertos[i]);
//        }


//              8.  Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz,
//              em seguida você deverá receber um outro valor e verificar se o elemento existe no conjunto de 10 valores da matriz.
//              Caso exista você deve imprimir uma mensagem: "O valor existe no conjunto", caso contrário deverá exibir: "O valor não existe no conjunto".

//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[2][5];
//        int numero;
//        boolean checa = false;
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<5; j++){
//                System.out.println("Insira um número até 100");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Digite um número qualquer para verificar se está na matriz");
//        numero = sc.nextInt();
//        for (int i =0; i<2; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (numero ==  matrix[i][j]) {
//                    checa = true;
//                }
//            }
//        }
//        if(checa)
//            System.out.println("O valor está no conjunto;");
//        else
//            System.out.println("O valor não existe no conjunto");

//                9. Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
//        some cada uma das linhas armazenando o resultado em um vetor;
//        some cada uma das colunas armazenando o resultado em um vetor;
//        imprima o resultado da soma das linhas;
//        imprima o resultado da soma das coluna;
//        imprima a matriz completa
//

//        Scanner sc = new Scanner(System.in);
//        int[][] matrix = new int[3][5];
//        int[] somaLinhas = new int[3];
//        int[] somaColunas = new int[5];
//        for (int i =0; i<3; i++){
//            for (int j = 0; j<5; j++){
//                matrix[i][j] = sc.nextInt();
//                somaLinhas[i] += matrix[i][j];
//                somaColunas[j] += matrix[i][j];
//            }
//        }
//        for(int i = 0; i< 3; i++)
//            System.out.println(somaLinhas[i]);
//        for(int i = 0; i< 5; i++)
//            System.out.println(somaColunas[i]);
//
//        for (int i =0; i<3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

//        10. Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto.
//        As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
//        Na sequência mostra o valor lido e a relação de notas necessárias.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um valor para calcular o menor número de cédulas");
//        int numeroNotas = sc.nextInt();
//
//        System.out.println("Número mínimo de cédulas para o valor de "+numeroNotas+":");
//        System.out.println("100: "+numeroNotas/100+ "\n50: "+(numeroNotas%100)/50+"\n20: " +((numeroNotas%100)%50)/20+"\n10: "+ (((numeroNotas%100)%50)%20)/10+"\n5: "+((((numeroNotas%100)%50)%20)%10)/5+"\n2: "+ (((((numeroNotas%100)%50)%20)%10)%5)/2+"\n1: "+(((((numeroNotas%100)%50)%20)%10)%5)%2);
//        System.out.println("Soma das cédulas = "+(numeroNotas/100+(numeroNotas%100)/50+((numeroNotas%100)%50)/20+(((numeroNotas%100)%50)%20)/10+ ((((numeroNotas%100)%50)%20)%10)/5 + (((((numeroNotas%100)%50)%20)%10)%5)/2 + (((((numeroNotas%100)%50)%20)%10)%5)%2));

//        int notas[] = {100, 50, 20, 10, 5,2,1};
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um valor para calcular o menor número de cédulas");
//        int valorNotas = sc.nextInt();
//        while (valorNotas > 0) {
//            for (int i = 0; i < notas.length; i++) {
//                if (valorNotas >= notas[i]) {
//                    int aux = valorNotas / notas[i];
//                    valorNotas = valorNotas - (aux * notas[i]);
//                    System.out.println(aux + " cedulas de " + notas[i] + ". ");
//                }
//            }
//        }
//       11. Leia um número inteiro que representa um código de DDD para discagem interurbana.
//                Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
//
//
//        Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
//        DDD nao cadastrado
//
//                Entrada
//        A entrada consiste de um único valor inteiro.
//
//        Saída
//        Imprima o nome da cidade correspondente ao DDD existente na entrada.
//                Imprima DDD não cadastrado caso não exista o DDD correspondente ao número digitado.
//
//        DDD
//                DESTINO
//        61        Brasília
//        71        Salvador
//        11        São Paulo
//        21        Rio de Janeiro
//        32        Juiz de Fora
//        19        Campinas
//        27        Vitória
//        31        Belo Horizonte


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o DDD");
//        int ddd = sc.nextInt();
//        switch (ddd){
//            case 61:
//                System.out.println("Brasília");
//                break;
//            case 71:
//                System.out.println("Salvador");
//                break;
//            case 11:
//                System.out.println("São Paulo");
//                break;
//            case 21:
//                System.out.println("Rio de Janeiro");
//                break;
//            case 32:
//                System.out.println("Juiz de Fora");
//                break;
//            case 19:
//                System.out.println("Campinas");
//                break;
//            case 27:
//                System.out.println("Vitória");
//                break;
//            case 31:
//                System.out.println("Belo Horizonte");
//                break;
//            default:
//                System.out.println("O DDD "+ddd+" não está cadastrado");
//                break;
//        }

//
//        12. Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
//        Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00 mais 5% sobre o que ultrapassar este valor,
//        calcular e escrever o seu salário total.

//
//        Scanner sc = new Scanner(System.in);
//        double comissao;
//        double salario;
//        double valorVendas;
//        System.out.println("Qual o salário fixo do vendedor?");
//        salario = sc.nextDouble();
//        System.out.println("Digite qual foi o valor de vendas do vendedor: ");
//        valorVendas = sc.nextDouble();
//        if (valorVendas <= 1500) {
//            comissao = valorVendas * 0.03;
//            salario += comissao;
//        }
//        else{
//            comissao = (1500*0.03)+(valorVendas-1500)*0.05;
//            salario += comissao;
//        }
//        System.out.printf("Salário total: %.2f", salario);
//
//        13. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//
//
//        Álcool
//        até 20 litros, desconto de 3% por litro
//        acima de 20 litros, desconto de 5% por litro
//
//        Gasolina
//        até 20 litros, desconto de 4% por litro
//        acima de 20 litros, desconto de 6% por litro
//
//
//        Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.
//
//
//        14. Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si,
//        bem como as das mulheres).
//
//                Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.

//
//        Scanner sc = new Scanner(System.in);
//        int homemVelho;
//        int homemNovo;
//        int mulherVelha;
//        int mulherNova;
//        int aux;
//        System.out.println("Digite a idade do primeiro homem: ");
//        homemNovo = sc.nextInt();
//        System.out.println("Digite a idade do segundo homem: ");
//        homemVelho = sc.nextInt();
//        if (homemNovo > homemVelho){
//            aux = homemNovo;
//            homemNovo = homemVelho;
//            homemVelho = aux;
//        }
//        System.out.println("Digite a idade da primeira mulher: ");
//        mulherNova = sc.nextInt();
//        System.out.println("Digite a idade da segunda mulher: ");
//        mulherVelha = sc.nextInt();
//        if (mulherNova > mulherVelha){
//            aux = mulherNova;
//            mulherNova = mulherVelha;
//            mulherVelha = aux;
//        }
//        System.out.printf("Soma: %d\nProduto: %d", (homemVelho+mulherNova), (homemNovo*mulherVelha));

//        15. Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes informações:
//        a quantidade de produtos que irá cadastrar
//        para cada produto:
//        o nome do produto
//        o número total de mercadorias no estoque;
//        o valor unitário da mercadoria.
//                Imprimir o valor total em estoque e a média de valor das mercadorias.

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Quantos produtos você irá cadastrar?");
//        int quantidade = sc.nextInt();
//        String[] nomeProdutos = new String[quantidade];
//        int[] quantidadeMercadorias = new int[quantidade];
//        double[] valorMercadoria = new double[quantidade];
//        double valorTotal = 0;
//        double media = 0;
//        for (int i = 0; i< quantidade; i++){
//            sc.nextLine();
//            System.out.println("Digite o nome da mercadoria "+ (i+1)+": ");
//            nomeProdutos[i] = sc.nextLine();
//            System.out.println("Digite a quantidade de mercadorias: ");
//            quantidadeMercadorias[i] = sc.nextInt();
//            System.out.println("Digite o valor da mercadoria: ");
//            valorMercadoria[i] = sc.nextDouble();
//            valorTotal += valorMercadoria[i]*quantidadeMercadorias[i];
//            media += valorMercadoria[i];
//        }
//        System.out.println("Valor total em estoque: "+valorTotal);
//        System.out.println("Média de valor das mercadorias: "+ media/quantidade);
//
//        for (int i =0; i<quantidade; i++){
//            System.out.println("Produto: "+nomeProdutos[i]);
//            System.out.println("Quantidade de mercadorias: "+quantidadeMercadorias[i]);
//            System.out.println("Valor mercadoria: "+valorMercadoria[i]);
//        }

//        16. Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos em um vetor.
//        Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI,
//        se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário
//
//        Scanner sc = new Scanner(System.in);
//        String[] nomes = new String[10];
//        String nomeAdicional;
//        boolean encontrado = false;
//        for (int i = 0; i<10; i++){
//            System.out.println("Digite o nome "+i+":");
//            nomes[i] = sc.nextLine();
//        }
//        System.out.println("Digite o nome que você quer procurar: ");
//        nomeAdicional = sc.nextLine();
//        for (int i = 0; i< 10; i++){
//            if (nomeAdicional == nomes[i]){
//                encontrado = true;
//            }
//        }
//        if (encontrado ==true){
//            System.out.println("ACHEI");
//        }else{
//            System.out.println("NÃO ACHEI");
//        }
//
//        17. A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos para coletar dados sobre o
//        salário e número de filhos de cada habitante e após as leituras, escrever:
//        Média de salário da população
//        Média do número de filhos
//        Maior salário dos habitantes
//        Percentual de pessoas com salário menor que R$ 150,00
//        Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.
//
//        Scanner sc = new Scanner(System.in);
//        double salario =0;
//        double salarioTotal = 0;
//        double maiorSalario=0;
//        int numeroFilhos;
//        double total = 0;
//        int filhosTotal = 0;
//        double salarioMenor=0;
//        while(true){
//
//            System.out.println("Digite o salário: ");
//            salario = sc.nextDouble();
//            if (salario < 0)
//                break;
//            else if (maiorSalario < salario)
//                maiorSalario = salario;
//            if (salario<150)
//                salarioMenor++;
//            salarioTotal+=salario;
//            System.out.println("Digite quantidade de filhos:  ");
//            numeroFilhos = sc.nextInt();
//            filhosTotal+=numeroFilhos;
//            total++;
//        }
//        System.out.printf("Média salário: R$%.2f \n", salarioTotal/total);
//        System.out.printf("Média filhos: %d \n", filhosTotal/(int) total);
//        System.out.printf("Maior salário: R$%.2f \n", maiorSalario);
//        System.out.printf("Percentual de pessoas que ganham abaixo de R$ 150,00: %.2f%% \n",(salarioMenor/total)*100);


    }
}
