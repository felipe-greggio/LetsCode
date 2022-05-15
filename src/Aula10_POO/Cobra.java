package Aula04_POO;

import java.util.Random;

public class Cobra extends Generico{

    Random random = new Random();

    public Cobra(){
        this.hitPoints = 150;
        this.dano = 10;
    }


    public void ataque(Jogador jogador) {
        int chanceEnvenenamento = 0;
        System.out.println("O monstro lhe causou 10 de dano.");
        jogador.sofrerDano(10);
        chanceEnvenenamento = random.nextInt(100);
        if(chanceEnvenenamento>=60 && jogador.isEnvenenado()==false) {
            System.out.println("A cobra enfia as presas fundo em você, você sente ela injetando um líquido frio no seu corpo. \nVocê está envenenado");
            jogador.setEnvenenado(true);
            jogador.setContadorEnvenenado(4);
        }
    }




    public void apanhar(Jogador jogador) {
        int dano = jogador.getDano() - random.nextInt(39);
        if (jogador.getTipoDano().equals("Pancada"))
            dano = dano * 2;
        System.out.println("O monstro recebeu " + dano + " de dano.");
        this.hitPoints = this.hitPoints - dano;
        if (this.hitPoints <= 0) {
            System.out.println("Antes que a cobra possa fugir, você impala ela de cabo a rabo, no fim das contas, é apenas uma cobra. \nVocê derrotou a cobra e se aprofunda na masmorra.");
            this.vivo = false;
            jogador.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida");
        }
    }

    public void interagir() {
        System.out.println("A cobra sibila uma frase críptica.\"Se você acender a chama a maldição acaba.\"");

    }

    public void desenharMonstro(){
        System.out.println(
                "        ---_ ......._-_--.\n" +
                "      (|\\ /      / /| \\  \\\n" +
                "      /  /     .'  -=-'   `.\n" +
                "     /  /    .'             )\n" +
                "   _/  /   .'        _.)   /\n" +
                "  / o   o        _.-' /  .'\n" +
                "  \\          _.-'    / .'*|\n" +
                "   \\______.-'//    .'.' \\*|\n" +
                "    \\|  \\ | //   .'.' _ |*|\n" +
                "     `   \\|//  .'.'_ _ _|*|\n" +
                "      .  .// .'.' | _ _ \\*|\n" +
                "      \\`-|\\_/ /    \\ _ _ \\*\\\n" +
                "       `/'\\__/      \\ _ _ \\*\\\n" +
                "      /^|            \\ _ _ \\*\n" +
                "     '  `             \\ _ _ \\     " +
                "                       \\_");
    }
}
