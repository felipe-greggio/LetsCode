package Aula10_POO;

import java.util.Random;

public class Generico extends Monstro{

    Random random = new Random();

    protected int hitPoints;
    protected int dano;
    protected boolean vivo;

    public Generico(){
        this.hitPoints = 200;
        this.dano = 15;
        this.vivo = true;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void ataque(HeroiGenerico heroi){
        System.out.println("O monstro lhe causou "+this.dano+" pontos de dano.");
        heroi.sofrerDano(this.dano);
    }

    @Override
       public void apanhar(HeroiGenerico heroi) {
        int dano = heroi.getDano() - random.nextInt(19);
        System.out.println("O monstro recebeu "+dano+" pontos de dano.");
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            System.out.println("Com um rápido golpe de sua arma, você degola este monstro sem compreender de fato o que ele era. \nVocê derrotou o monstro e continua em sua aventura.");
            this.vivo = false;
            heroi.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida.");
        }
    }


    @Override
    public void interagir() {
        System.out.println("Você pergunta ao monstro o que ele é exatamente, mas ele não parece gostar. \"Por que eu responderia meu inimigo???\"");
    }

    public void apresentarMonstro(){
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


        System.out.println();
        System.out.println("Você se depara com um monstro, você não entende exatamente o que ele é, mas parece razoavelmente fraco.");
        Jogo.apertarTecla();
    }


    public boolean isVivo(){
        return this.vivo;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;

    }

}
