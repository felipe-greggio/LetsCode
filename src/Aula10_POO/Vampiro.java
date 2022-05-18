package Aula10_POO;

import java.util.Random;

public class Vampiro extends Generico{

    Random random = new Random();

    public Vampiro(){
        this.hitPoints = 400;
        this.dano = 25;
        this.vivo = true;
    }


    public void ataque(HeroiGenerico heroi) {
        int chanceSangramento = 0;
        System.out.println("O gigante lhe causou "+this.dano+" pontos de dano.");
        heroi.sofrerDano(this.dano);
        chanceSangramento = random.nextInt(100);
        if(chanceSangramento>=50 && heroi.isSangrando()==false){
            System.out.println("O vampiro lhe corta a jugular, você sente algo quente escorrendo por sua armadura. \nVocê está sangrando.");
            heroi.setSangrando(true);
            heroi.setContadorSangrando(3);
        }
    }


    public void apanhar(HeroiGenerico heroi) {
        int dano = heroi.getDano() - random.nextInt(19);
        if(heroi.getTipoDano().equals("Perfurante")){
            System.out.println("Este monstro é fraco contra o elemento do ar.");
            dano = dano * 2;
        }
        System.out.println("O vampiro recebeu "+dano+" pontos de dano.");
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            System.out.println("Com um rápido golpe de sua arma, você degola o vampiro, sangue se espalha por seu rosto. \nVocê derrotou o vampiro.");
            this.vivo = false;
            heroi.incrementarMonstrosDerrotados();
        }
        else{
            System.out.println("Ele ainda tem "+this.hitPoints+" pontos de vida.");
        }
    }


    public void interagir() {
        System.out.println("O vampiro balbucia incoerentemente sobre as razões de estar invadindo o mundo humano. \"O que é um homem?\"");

    }

    @Override
    public void apresentarMonstro() {
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
        System.out.println();
        System.out.println("Indo em frente, você encontra o último monstro, o chefe de todos. Um vampiro sugador de sangue!");
        Jogo.apertarTecla();
    }
}
