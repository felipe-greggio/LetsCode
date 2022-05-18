package Aula10_POO;

import java.util.Random;

public class Gigante extends Generico {

    Random random = new Random();

    public Gigante(){
        this.hitPoints = 200;
        this.dano = 10;
    }


    public void ataque(HeroiGenerico jogador) {
        int chanceAtordoado = 0;
        System.out.println("O gigante lhe causou 25 de dano.");
        jogador.sofrerDano(25);
        chanceAtordoado = random.nextInt(100);
        if(chanceAtordoado>=75 && jogador.isAtordoado()==false) {
            System.out.println("O monstro lhe dá uma pancada crítica. \nVocê está atordoado");
            jogador.setAtordoado(true);
            jogador.setContadorAtordoado(2);
        }
    }

    public void apanhar(HeroiGenerico heroi) {
        int dano = heroi.getDano() - random.nextInt(39);
        if (heroi.getTipoDano().equals("Fogo"))
            dano = dano * 2;
        System.out.println("O monstro recebeu " + dano + " pontos  de dano.");
        this.hitPoints = this.hitPoints - dano;
        if (this.hitPoints <= 0) {
            System.out.println("Aproveitando-se de sua velocidade superior, você consegue dar a volta pelo gigante e o apunhala pelas costas, perfurando seu coração. \nVocê derrotou o gigante.");
            this.vivo = false;
            heroi.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida");
        }
    }



    public void interagir() {
        System.out.println("O monstro parece desconcertado de estar te enfrentando. \"Me desculpe\".");

    }

    @Override
    public void apresentarMonstro() {
        System.out.println(
                "                           __,='`````'=/__\n" +
                "                          '//  (o) \\(o) \\ `'         _,-,\n" +
                "                          //|     ,_)   (`\\      ,-'`_,-\\\n" +
                "                        ,-~~~\\  `'==='  /-,      \\==```` \\__\n" +
                "                       /        `----'     `\\     \\       \\/\n" +
                "                    ,-`                  ,   \\  ,.-\\       \\\n" +
                "                   /      ,               \\,-`\\`_,-`\\_,..--'\\\n" +
                "                  ,`    ,/,              ,>,   )     \\--`````\\\n" +
                "                  (      `\\`---'`  `-,-'`_,<   \\      \\_,.--'`\n" +
                "                   `.      `--. _,-'`_,-`  |    \\\n" +
                "                    [`-.___   <`_,-'`------(    /\n" +
                "                    (`` _,-\\   \\ --`````````|--`\n" +
                "                     >-`_,-`\\,-` ,          |\n" +
                "                   <`_,'     ,  /\\          /\n" +
                "                    `  \\/\\,-/ `/  \\/`\\_/V\\_/\n" +
                "                       (  ._. )    ( .__. )\n" +
                "                       |      |    |      |\n" +
                "                        \\,---_|    |_---./\n" +
                "                        ooOO(_)    (_)OOoo");
        System.out.println();
        System.out.println("Indo em frente, você encontra um gigante comedor de homens!");
        Jogo.apertarTecla();
    }

}
