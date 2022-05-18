package Aula10_POO;


import java.io.*;
import java.util.*;

public class Jogo {

    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void desenharIntro(){
        System.out.println(
                        "///////////////////////////////////////////////////////////\n" +
                        "                 BEM VINDO A FAKEVANIA\n" +
                        "///////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println("Você é a última chance da humanidade contra as forças do mal, derrote todos os inimigos para salvar a humanidade e adquirir glória eterna.");
        System.out.println();
        Jogo.apertarTecla();
    }

    public static void ganhouJogo(){
        System.out.println(
                "///////////////////////////////////////////////////////////\n"+
                "                      VOCÊ VENCEU O JOGO                   \n\n"+
                        "                   ___________\n" +
                        "                  '._==_==_=_.'\n" +
                        "                 .-\\:      /-.\n" +
                        "                 | (|:.     |) |\n" +
                        "                  '-|:.     |-'\n" +
                        "                   \\::.    /\n" +
                        "                     '::. .'\n" +
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
    public static void escolherELemento(HeroiGenerico heroi){
        int opcao=0;
        System.out.println("Antes de partir para viajar ao coração do mal, você visita um mago para lhe auxiliar.\nEle lhe oferece a ajuda dos espíritos elementais.");
        System.out.println();
        while (opcao<1 ||opcao>4){
            System.out.println("Escolha um dos elementos para te ajudar na sua aventura. \n1- FOGO\n2- ÁGUA\n3- TERRA\n4- AR");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    heroi.setElementoDano("FOGO");
                    break;
                case 2:
                    heroi.setElementoDano("AGUA");
                    break;
                case 3:
                    heroi.setElementoDano("TERRA");
                    break;
                case 4:
                    heroi.setElementoDano("AR");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        Jogo.apertarTecla();
        scan.nextLine();
    }

    public static HeroiGenerico escolherClasse(){
        int opcao=0;
        HeroiGenerico heroi = null;
        System.out.println("Você se preparou por anos para esta batalha, especializando-se em uma única forma de combate.");
        while (opcao<1 ||opcao>3){
            System.out.println("Escolha uma classe para seu herói. \n1- Orc Bárbaro\n2- Humano Mago\n3- Elfa Arqueira");
            System.out.println();
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    heroi = new HeroiBarbaro();

                    break;
                case 2:
                    heroi = new HeroiBarbaro();
                    //return new HeroiMago();
                    break;
                case 3:
                    heroi = new HeroiBarbaro();
                    //return new HeroiArqueira();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        apertarTecla();
        System.out.println();
        return heroi;
    }

    public static String toString(HeroiGenerico heroi) {
        return heroi.toString();
    }

    public static void batalha(HeroiGenerico heroi, Monstro monstro){

        while(heroi.isVivo()==true && monstro.isVivo()==true) {
            Jogo.turnoJogador(heroi, monstro);
            if(monstro.isVivo()==false)
                break;
            Jogo.turnoMonstro(heroi, monstro);
            if(heroi.isVivo()==false){
                break;
            }
            Jogo.turnoEfeitos(heroi);
        }
    }

    public static void turnoJogador(HeroiGenerico heroi, Monstro monstro){
        int opcao = 0;
        while(opcao<1 || opcao >2){
            System.out.println();
            System.out.println("Decida o que quer fazer: \n1- Atacar\n2-Interagir\n3-Ver Status");
            System.out.println("[HP: "+heroi.getHitPoints()+" MP: "+heroi.getMagicPoints()+"]");
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                    heroi.atacarMonstro(monstro);
                    break;
                case 2:
                    monstro.interagir();
                    break;
                case 3:
                    System.out.println("STATUS");
                    System.out.println(heroi.toString());
                    voltar();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        apertarTecla();
    }

    public static void turnoMonstro(HeroiGenerico heroi, Monstro monstro){
        monstro.ataque(heroi);
        apertarTecla();
    }

    public static void turnoEfeitos(HeroiGenerico heroi){
        heroi.sofrerCondicao();
        heroi.limparCondicao();
    }

    public static void fogueira(HeroiGenerico heroi){


        InputStream ins = null; // raw byte-stream
        Reader r = null; // cooked reader
        BufferedReader br = null; // buffered for readLine()
        try {
            String s;
            ins = new FileInputStream("C:\\Users\\Felipe\\IdeaProjects\\LetsCode\\src\\Aula10_POO\\Ascii\\ascii_fire.txt");
            r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
            br = new BufferedReader(r);
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage()); // handle exception
        }
        finally {
            if (br != null) { try { br.close(); } catch(Throwable t) {  } }
            if (r != null) { try { r.close(); } catch(Throwable t) { /* ensure close happens */ } }
            if (ins != null) { try { ins.close(); } catch(Throwable t) { /* ensure close happens */ } }
        }
        System.out.println();
        System.out.println("Após cansativas batalhas, você finalmente acha um lugar para acender uma fogueira e poder descansar" +
                "\nou você pode tentar explorar um pouco e ver se encontra alguma coisa interessante que possa lhe ajudar em sua aventura...");
        System.out.println();
        int opcao = 0;
        while(opcao<1 || opcao >2){
            System.out.println();
            System.out.println("Decida o que quer fazer: \n1- Meditar (Recuperar 20% de vida e mana) \n2-Explorar");
            System.out.println("[HP: "+heroi.getHitPoints()+" MP: "+heroi.getMagicPoints()+"]");
            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Você decide que uma noite de bom sono é melhor do que ficar andando por aí no escuro.");
                    System.out.println("Você recuperou"+ Math.round(heroi.getHitPoints()/5)+ " pontos de vida e "+Math.round(heroi.getMagicPoints()/5)+" pontos de mana.");
                    heroi.meditar();
                    break;
                case 2:
                    Jogo.evento(heroi);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        apertarTecla();
    }

    public static void evento(HeroiGenerico heroi){
        List<String> listaEventos = new ArrayList<>(Arrays.asList("Fonte", "Cálice", "Criatura", "Herói Desconhecido"));
        int qualEvento = 0;
        qualEvento = random.nextInt(listaEventos.size());
        String evento = listaEventos.remove(qualEvento);
        if (evento.equals("Fonte")){
            Jogo.eventoFonte(heroi);

        }else if (evento.equals("Cálice")){
            Jogo.eventoFonte(heroi);
        }else if (evento.equals("Criatura")){
            Jogo.eventoFonte(heroi);
        }else{

        }
    }

    public static void eventoFonte(HeroiGenerico heroi){
        System.out.println("Você encontra uma fonte mágica, você se sente estranhamente atraído por ela");
        System.out.println("Você bebe da fonte e se sente rejuvesnecido, pronto para outra batalha.\nVocê recuperou toda sua vida e mana, bem como você limpa todas suas condições negativas");
        heroi.recuperarCompletamente();
    }

    public static void apertarTecla(){
        System.out.println();
        System.out.println("Aperte qualquer tecla para continuar...");
        scan.nextLine();
    }

    public static void voltar(){
        System.out.println();
        System.out.println("Aperte qualquer tecla para voltar ao menu anterior...");
        scan.nextLine();
    }
}
