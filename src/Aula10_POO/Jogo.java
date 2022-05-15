package Aula04_POO;

import java.util.Scanner;

public class Jogo {


    static Scanner scan = new Scanner(System.in);

    public static void desenharIntro(){
        System.out.println(
                        "///////////////////////////////////////////////////////////\n" +
                        "                 BEM VINDO A FAKEVANIA\n" +
                        "///////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("Você é a última chance da humanidade contra as forças do mal, derrote todos os inimigos para salvar a humanidade e adquirir glória eterna");
        System.out.println();
        Jogo.apertarTecla();
    }

    public static void ganhouJogo(){
        System.out.println(
                "///////////////////////////////////////////////////////////\n"+
                "                      VOCÊ VENCEU O JOGO                   \n\n"+
                        "                   ___________\n" +
                        "                  '._==_==_=_.'\n" +
                        "                  .-\\:      /-.\n" +
                        "                   | (|:.     |) |\n" +
                        "                    '-|:.     |-'\n" +
                        "                      \\::.    /\n" +
                        "                       '::. .'\n" +
                        "                      ) (\n" +
                        "                    _.' '._\n" +
                        "                 `\"\"\"\"\"\"\"`" +
                        "\n///////////////////////////////////////////////////////////");

    }

    public static void perdeuJogo(){

        System.out.println(
                "///////////////////////////////////////////////////////////\n" +
                "                       VOCÊ PERDEU O JOGO                  \n" +
                "              .ed\"\"\"\" \"\"\"$$$$be.\n" +
                "            -\"           ^\"\"**$$$e.\n" +
                "           .\"                   '$$$c\n" +
                "         /                      \"4$$b\n" +
                "        d  3                      $$$$\n" +
                "        $  *                   .$$$$$$\n" +
                "       .$  ^c           $$$$$e$$$$$$$$.\n" +
                "       d$L  4.         4$$$$$$$$$$$$$$b\n" +
                "       $$$$b ^ceeeee.  4$$ECL.F*$$$$$$$\n" +
                "       $$$$P d$$$$F $ $$$$$$$$$- $$$$$$\n" +
                "       3$$$F \"$$$$b   $\"$$$$$$$  $$$$*\"\n" +
                "       $$P\"  \"$$b   .$ $$$$$...e$$\n" +
                "       *c    ..    $$ 3$$$$$$$$$$eF\n" +
                "         %ce\"\"    $$$  $$$$$$$$$$*\n" +
                "           *$e.    *** d$$$$$\"L$$\n" +
                "           $$$      4J$$$$$% $$$\n" +
                "           $\"'$=e....$*$$**$cz$$\"\n" +
                "            $  *=%4.$ L L$ P3$$$F\n" +
                "            $   \"%*ebJLzb$e$$$$$b\n" +
                "             %..      4$$$$$$$$$$\n" +
                "               $$$e   z$$$$$$$$$$ \n" +
                "                \"*$c  \"$$$$$$$P\"\n" +
                "               \"\"\"*$$$$$$$\"" +
                "\n///////////////////////////////////////////////////////////");

    }
    public static void escolherELemento(Jogador jogador){
        int opcao=0;
        while (opcao<1 ||opcao>4){
            System.out.println("Escolha um dos elementos para te ajudar na sua aventura. \n1- FOGO\n2- ÁGUA\n3- TERRA\n4- AR");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    jogador.setElementoDano("FOGO");
                    break;
                case 2:
                    jogador.setElementoDano("AGUA");
                    break;
                case 3:
                    jogador.setElementoDano("TERRA");
                    break;
                case 4:
                    jogador.setElementoDano("AR");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
        Jogo.apertarTecla();
        scan.nextLine();
    }

    public static void turnoJogador(Jogador jogador, Monstro monstro){
        int opcao = 0;
        while(opcao<1 || opcao >2){
            System.out.println("Decida o que quer fazer: \n1- Atacar\n2-Interagir");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    monstro.apanhar(jogador);
                    break;
                case 2:
                    monstro.interagir();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
        apertarTecla();
        scan.nextLine();
    }

    public static void turnoMonstro(Jogador jogador, Monstro monstro){
        monstro.ataque(jogador);
        apertarTecla();
    }

    public static void turnoEfeitos(Jogador jogador){
        jogador.sofrerCondicao();
        jogador.limparCondicao();
    }

    public static void apertarTecla(){
        System.out.println("Aperte qualquer tecla para continuar...");
        scan.nextLine();
    }
}
