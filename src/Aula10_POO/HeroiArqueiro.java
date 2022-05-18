package Aula10_POO;

import java.io.*;
import java.util.Scanner;

public class HeroiArqueiro extends HeroiGenerico{

    Scanner scan = new Scanner(System.in);

    public HeroiArqueiro(){
        this.hitPoints = 200;
        this.magicPoints = 100;
        this.dano = 45;
        this.contadorEnvenenado = 0;
        this.contadorSangrando = 0;
        this.contadorAtordoado = 0;
        this.vivo = true;
        this.monstrosDerrotados=0;
        apresentarHeroi();

    }

    public void sofrerDano(int dano) {
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            this.morrer();
            return;
        }
        System.out.println("Você ainda tem "+this.hitPoints+" pontos de vida.");
    }

    public int getDano() {
        return dano;
    }

    @Override
    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getMagicPoints(){ return this.magicPoints;}

    public boolean isVivo() {
        return vivo;
    }
    public void morrer(){
        System.out.println("Você tomou muito dano e não aguentou. Você sente suas forças indo embora, então é assim que é morrer? \nAs forças do mal tomam controle e você é esquecido pela história.");
        this.vivo= false;
    }
    public boolean isVencedor() {
        return vencedor;
    }
    public void setVencedor(boolean vencedor){
        this.vencedor = vencedor;
    }

    public String getTipoDano(){
        return this.tipoDano;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }
    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }
    public void setContadorEnvenenado(int contadorEnvenenado) {
        this.contadorEnvenenado = contadorEnvenenado-2;
    }

    public boolean isSangrando() {
        return sangrando;
    }
    public void setSangrando(boolean sangrando) {
        this.sangrando = sangrando;
    }
    public void setContadorSangrando(int contadorSangrando) {
        this.contadorSangrando = contadorSangrando-2;
    }

    public boolean isAtordoado() {
        return atordoado;
    }
    public void setAtordoado(boolean atordoado) {
        this.atordoado = atordoado;
    }
    public void setContadorAtordoado(int contadorAtordoado) {
        this.contadorAtordoado = contadorAtordoado;
    }

    public void incrementarMonstrosDerrotados(){
        this.monstrosDerrotados++;
    }
    public int getMonstrosDerrotados(){
        return monstrosDerrotados;
    }

    public void setElementoDano(String elemento){
        this.elementoDano = Elemento.valueOf(elemento);
        if(elementoDano.equals(Elemento.FOGO)){
            this.tipoDano = "Fogo";
        }
        else if(elementoDano.equals(Elemento.AR)){
            this.tipoDano = "Perfurante";
        }
        else if(elementoDano.equals(Elemento.TERRA)){
            this.tipoDano = "Pancada";
        }
        else if(elementoDano.equals(Elemento.AGUA)){
            this.hitPoints = this.hitPoints +50;
            this.tipoDano = "Aquático";
        }
    }

    public void atacarMonstro(Monstro monstro){
        String[] listaAtaques ={"Ataque Normal","Tiro mágico - 7MP", "Chuva de flechas - 14MP"};
        int opcao = 0;
        while(true){
            System.out.println();
            System.out.println("Escolha seu ataque: \n1- "+listaAtaques[0]+"\n2- "+listaAtaques[1]+"\n3- "+listaAtaques[2]);
            opcao = scan.nextInt();
            scan.nextLine();
            if (opcao ==1){
                System.out.println("Você ataca o monstro com sua arma.");
                monstro.apanhar(this);
                break;
            }
            else if (opcao==2){
                if(this.magicPoints<7){
                    System.out.println("Você não tem mana suficiente para usar este ataque.");
                    continue;
                }
                else{
                    System.out.println("Você pega uma flecha e mergulha ela numa poção mágica que você preparou. Você atira a flecha sem olhar, pois sabe que ela sempre irá atingir entre os olhos do inimigo.");
                    this.magicPoints = this.magicPoints-7;
                    this.dano +=12;
                    monstro.apanhar(this);
                    this.dano -=12;
                    break;
                }
            }else if (opcao==3){
                if(this.magicPoints<14){
                    System.out.println("Você não tem mana suficiente para usar este ataque.");
                    continue;
                }
                else{
                    System.out.println("Você sabe que os elfos não aprovariam que você fizesse isso, mas não se importa. \nVocê lança uma flecha para o alto e fala o encantamento.Em seguida, aquela flecha se multiplica e milhares delas chovem em cima do monstro.");
                    this.magicPoints = this.magicPoints-14;
                    this.dano +=50;
                    monstro.apanhar(this);
                    this.dano -=50;
                    break;
                }
            }
        }
    }

    public void meditar(){
        this.hitPoints += Math.round(this.hitPoints/5);
        this.magicPoints += Math.round(this.magicPoints/5);
    }
    public void recuperarCompletamente(){
        this.magicPoints = 100;
        if(elementoDano.equals(Elemento.AGUA))
            this.hitPoints = 250;
        else
            this.hitPoints = 200;
        setAtordoado(false);
        setContadorAtordoado(0);
        setEnvenenado(false);
        setContadorEnvenenado(0);
        setSangrando(false);
        setContadorSangrando(0);
    }

    public void aumentarDano(){
        this.dano += 10;
    }

    public void sofrerCondicao(){
        if(this.isSangrando() == true && this.isVivo() == true){
            System.out.println("Você está perdendo sangue rapidamente. você se sente enfraquecido e perde 10 pontos de vida.");
            sofrerDano(10);
        }
        if(this.isEnvenenado() == true && this.isVivo() == true){
            System.out.println("Você sente suas entranhas pegando fogo por conta do veneno, isso está te matando. você perde 15 pontos de vida.");
            sofrerDano(15);
        }
        if(this.isAtordoado() == true && this.isVivo() == true){
            System.out.println("Você está atordoado e não consegue focar no inimigo ou manter o equilíbrio. você causa 30% menos de dano.");
            this.dano = (this.dano*7)/10;
        }

    }

    public void limparCondicao(){
        if (this.contadorSangrando>0){
            this.contadorSangrando--;
            if(this.contadorSangrando==0){
                System.out.println("Você conseguiu estancar o sangramento e não está sangrando mais!");
                this.sangrando = false;
            }
        }
        if (this.contadorEnvenenado>0){
            this.contadorEnvenenado--;
            if(this.contadorEnvenenado==0){
                System.out.println("Seu corpo finalmente conseguiu eliminar o veneno e você está curado!");
                this.envenenado = false;
            }
        }
        if (this.contadorAtordoado>0){
            this.contadorAtordoado--;
            if(this.contadorAtordoado==0){
                System.out.println("Você parou de ver estrelas e conseguiu se equilibrar novamente, não está mais atordoado!");
                this.atordoado = false;
                this.dano = 45;
            }
        }
    }
    public void apresentarHeroi(){

        InputStream ins = null; // raw byte-stream
        Reader r = null; // cooked reader
        BufferedReader br = null; // buffered for readLine()
        try {
            String s;
            ins = new FileInputStream("C:\\Users\\Felipe\\IdeaProjects\\LetsCode\\src\\Aula10_POO\\Ascii\\ascii_elf.txt");
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

        System.out.println("Você acha que seria engraçado se o mundo humano fosse salvo por uma elfa, talvez eles aprendessem um pouco de humildade....sem contar que a gratidão humana costuma ser acompanhada de muito ouro.");
        System.out.println("Seus anos na floresta lhe ensinaram a usar plantas medicinais para se curar mais rapidamente caso sofra alguma condição.");

    }


    @Override
    public String toString() {
        return "Elfa Arqueira{" +
                "\nPontos de Vida=" + hitPoints +"/200"+
                "\nMana=" + magicPoints+"/100"+
                "\nQuantidade de dano=" + dano +
                "\nTipo de Dano='" + tipoDano + '\'' +
                "\nElemento =" + elementoDano +
                "\nEnvenenado=" + envenenado +
                "\nSangrando=" + sangrando +
                "\nAtordoado=" + atordoado +
                "\nMonstros Derrotados=" + monstrosDerrotados +
                "}";
    }
}
