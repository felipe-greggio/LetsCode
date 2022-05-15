package Aula04_POO;

import java.util.Scanner;

public class Master {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Generico generico = new Generico();
        Generico vampiro = new Vampiro();
        Generico cobra = new Cobra();
        Generico gigante = new Gigante();
        Jogador jogador = new Jogador();

        Jogo.desenharIntro();
        System.out.println("Antes de partir para viajar ao coração do mal, você visita um mago para lhe auxiliar.\nEle lhe oferece a ajuda dos espíritos elementais.");
        System.out.println();
        Jogo.escolherELemento(jogador);
        do{
            generico.desenharMonstro();
            System.out.println();
            System.out.println("Você se depara com um monstro, você não entende exatamente o que ele é, mas parece razoavelmente fraco.");
            Jogo.apertarTecla();
            while(jogador.isVivo()==true && generico.isVivo()==true) {
                Jogo.turnoJogador(jogador, generico);
                if(generico.isVivo()==false)
                    break;
                Jogo.turnoMonstro(jogador, generico);
                if(jogador.isVivo()==false){
                    break;
                }
                Jogo.turnoEfeitos(jogador);
            }
            if(jogador.isVivo()==false){
                break;
            }
            System.out.println("Indo em frente, você encontra o segundo monstro a se enfrentar. Uma cobra gigantesca maior do que você!");
            Jogo.apertarTecla();
            cobra.desenharMonstro();
            while(jogador.isVivo()==true && cobra.isVivo()==true) {
                Jogo.turnoJogador(jogador, cobra);
                if(cobra.isVivo()==false)
                    break;
                Jogo.turnoMonstro(jogador, cobra);
                if(jogador.isVivo()==false){
                    break;
                }
                Jogo.turnoEfeitos(jogador);
            }
            if(jogador.isVivo()==false){
                break;
            }
            System.out.println("Indo em frente, você encontra o terceiro monstro a se enfrentar. Um gigante comedor de homens!");
            Jogo.apertarTecla();
            gigante.desenharMonstro();
            while(jogador.isVivo()==true && gigante.isVivo()==true) {
                Jogo.turnoJogador(jogador, gigante);
                if(gigante.isVivo()==false)
                    break;
                Jogo.turnoMonstro(jogador, gigante);
                if(jogador.isVivo()==false){
                    break;
                }
                Jogo.turnoEfeitos(jogador);
            }
            System.out.println("Indo em frente, você encontra o último monstro, o chefe de todos. Um vampiro sugador de sangue!");
            Jogo.apertarTecla();
            vampiro.desenharMonstro();
            while(jogador.isVivo()==true && vampiro.isVivo()==true) {
                Jogo.turnoJogador(jogador, vampiro);
                if(vampiro.isVivo()==false)
                    break;
                Jogo.turnoMonstro(jogador, vampiro);
                if(jogador.isVivo()==false){
                    break;
                }
                Jogo.turnoEfeitos(jogador);
            }
            if(jogador.isVivo()==false){
                break;
            }
            if (jogador.getMonstrosDerrotados()==4){
                jogador.setVencedor(true);
                break;
            }
        }while(true);



        if (jogador.isVencedor()==true){
            Jogo.ganhouJogo();
        }
        else{
            Jogo.perdeuJogo();
        }
    }
}