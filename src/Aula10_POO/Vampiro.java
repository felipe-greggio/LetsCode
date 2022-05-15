package Aula04_POO;

import java.sql.SQLOutput;
import java.util.Random;

public class Vampiro extends Generico{

    Random random = new Random();

    public Vampiro(){
        this.hitPoints = 180;
        this.dano = 20;
        this.vivo = true;
    }


    public void ataque(Jogador jogador) {
        int chanceSangramento = 0;
        System.out.println("O monstro lhe causou 20 de dano.");
        jogador.sofrerDano(20);
        chanceSangramento = random.nextInt(100);
        if(chanceSangramento>=50 && jogador.isSangrando()==false){
            System.out.println("O vampiro lhe corta a jugular, você sente algo quente escorrendo por sua armadura. \nVocê está sangrando");
            jogador.setSangrando(true);
            jogador.setContadorSangrando(3);
        }
    }


    public void apanhar(Jogador jogador) {
        int dano = jogador.getDano() - random.nextInt(39);
        if(jogador.getTipoDano().equals("Perfurante"))
            dano = dano*2;
        System.out.println("O monstro recebeu "+dano+" de dano.");
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            System.out.println("Com um rápido golpe de sua arma, você degola o vampiro, sangue se espalha por seu rosto. \nVocê derrotou o vampiro e continua a explorar");
            this.vivo = false;
            jogador.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida");
        }
    }


    public void interagir() {
        System.out.println("O vampiro balbucia incoerentemente sobre as razões de estar invadindo o mundo humano. \"O que é um homem?\"");

    }

    @Override
    public void desenharMonstro() {
        System.out.println(
                "                           _.-.\n" +
                "                       ._.-.\\\n" +
                "                     _.-'=. \\\\\n" +
                "                 .-._.-=-..' \\'.\n" +
                "               _.--._-='.'   |  `.\n" +
                "              _`.-.`=-./'.-. / .-.\\\n" +
                "              _.-=-=-/ | '._)`(_.'|\n" +
                "              _.--=.'  `. (.-v-.)/\n" +
                "              _.-.' \\-.' `-..-..'\n" +
                "             .-.'      `.'  \" \".\n" +
                "            /   )        \\  /   \\\n" +
                "           /   /\\                \\\n" +
                "         .'  .'\\ `.        .'     \\\n" +
                "        /   /   \\  `-    -' .`.    .\n" +
                "      .''\\.'    | `.      .'   `.   \\\n" +
                "     /   |      |      .'/       `.- `.\n" +
                "    |   /       / `.    |         \\   |\n" +
                "    |  /       |       .'.         `. |\n" +
                "    / /       /           \\          \\ \\\n" +
                "   /  |      /             \\         |  `.\n" +
                "  /   `.     |      `   .'  \\        /    \\\n" +
                " ///.-'.\\    |       \\ /    `\\      / /-.  \\\n" +
                " \\\\\\\\   `     \\.-     |    `-.\\     '/   \\\\\\\\\n" +
                "  \\\\\\|        |      / \\      |          ////\n" +
                "   '''        |     /   \\     |          |//\n" +
                "              |.-  |     \\  .-|          ''\n" +
                "              /    |    / ` ../\n" +
                "              |'   /    |    /\n" +
                "              \\.'  |    | `./\n" +
                "              /    \\   /    \\\n" +
                "              \\ `. /   \\    /\n" +
                "               |  |     '. '\n" +
                "               /  |      |  \\\n" +
                "              /   |      /   `.\n" +
                "             | | | \\   .'  `.. \\\n" +
                "            / / / ._`. \\.'-. \\`/\n" +
                "            |/ / /  `'  `  |/|/\n" +
                "             \\|\\|");
    }
}
