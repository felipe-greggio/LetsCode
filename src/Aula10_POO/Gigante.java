package Aula10_POO;

import java.util.Random;

public class Gigante extends Generico {

    Random random = new Random();

    public Gigante(){
        this.hitPoints = 380;
        this.dano = 30;
    }


    public void ataque(HeroiGenerico heroi) {
        System.out.println("O gigante lhe causou "+this.dano+" pontos de dano.");
        heroi.sofrerDano(this.dano);
        if (heroi instanceof HeroiBarbaro){
            return;
        }
        int chanceAtordoado = 0;
        chanceAtordoado = random.nextInt(100);
        if(chanceAtordoado>=75 && heroi.isAtordoado()==false) {
            System.out.println("O monstro lhe dá uma pancada crítica. \nVocê está atordoado.");
            heroi.setAtordoado(true);
            heroi.setContadorAtordoado(2);
        }
    }

    public void apanhar(HeroiGenerico heroi) {
        int dano = heroi.getDano() - random.nextInt(19);
        if (heroi.getTipoDano().equals("Fogo")){
            System.out.println("Este monstro é fraco contra o elemento de fogo.");
            dano = dano * 2;
        }
        System.out.println("O gigante recebeu " + dano + " pontos  de dano.");
        this.hitPoints = this.hitPoints - dano;
        if (this.hitPoints <= 0) {
            System.out.println("Aproveitando-se de sua velocidade superior, você consegue dar a volta pelo gigante e o apunhala pelas costas, perfurando seu coração. \nVocê derrotou o gigante.");
            this.vivo = false;
            heroi.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida.");
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
