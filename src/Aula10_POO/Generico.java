package Aula04_POO;

import java.util.Random;

public class Generico extends Monstro{

    Random random = new Random();

    protected int hitPoints;
    protected int dano;
    protected boolean vivo;

    public Generico(){
        this.hitPoints = 100;
        this.dano = 10;
        this.vivo = true;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void ataque(Jogador jogador){
        System.out.println("O monstro lhe causou 10 de dano.");
        jogador.sofrerDano(10);
    }

    @Override
       public void apanhar(Jogador jogador) {
        int dano = jogador.getDano() - random.nextInt(39);
        System.out.println("O monstro recebeu "+dano+" de dano.");
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            System.out.println("Com um rápido golpe de sua arma, você degola este monstro sem compreender de fato o que ele era. \nVocê derrotou o monstro e continua em sua aventura");
            this.vivo = false;
            jogador.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida");
        }
    }


    @Override
    public void interagir() {
        System.out.println("Você pergunta ao monstro o que ele é exatamente, mas ele não parece gostar. \"Por que eu responderia meu inimigo???\"");
    }

    public void desenharMonstro(){
        System.out.println(
                "                   (    )\n" +
                "                  ((((()))\n" +
                "                  |o\\ /o)|\n" +
                "                  ( (  _')\n" +
                "                   (._.  /\\__\n" +
                "                  ,\\___,/ '  ')\n" +
                "    '.,_,,       (  .- .   .    )\n" +
                "     \\   \\\\     ( '        )(    )\n" +
                "      \\   \\\\    \\.  _.__ ____( .  |\n" +
                "       \\  /\\\\   .(   .'  /\\  '.  )\n" +
                "        \\(  \\\\.-' ( /    \\/    \\)\n" +
                "         '  ()) _'.-|/\\/\\/\\/\\/\\|\n" +
                "             '\\\\ .( |\\/\\/\\/\\/\\/|\n" +
                "               '((  \\    /\\    /\n" +
                "               ((((  '.__\\/__.')\n" +
                "                ((,) /   ((()   )\n" +
                "                 \"..-,  (()(\"   /\n" +
                "            pils  _//.   ((() .\"\n" +
                "          _____ //,/\" ___ ((( ', ___\n" +
                "                           ((  )\n" +
                "                            / /\n" +
                "                          _/,/'\n" +
                "                        /,/,\"");
    }


    public boolean isVivo(){
        return this.vivo;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;

    }

}
