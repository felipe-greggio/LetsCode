package Aula10_POO;

import java.io.*;
import java.util.Scanner;

public class HeroiBarbaro extends HeroiGenerico {

    Scanner scan = new Scanner(System.in);

    public HeroiBarbaro(){
        this.hitPoints = 300;
        this.magicPoints = 50;
        this.dano = 70;
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
        this.contadorEnvenenado = contadorEnvenenado;
    }

    public boolean isSangrando() {
        return sangrando;
    }
    public void setSangrando(boolean sangrando) {
        this.sangrando = sangrando;
    }
    public void setContadorSangrando(int contadorSangrando) {
        this.contadorSangrando = contadorSangrando;
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
            System.out.println("Seus punhos são imbuídos com o elemento do fogo, seus punhos flamejam com poder. \nVocê agora causa dano de fogo.");
            this.tipoDano = "Fogo";
        }
        else if(elementoDano.equals(Elemento.AR)){
            System.out.println("Sua arma é imbuída com o elemento do ar, você fica impressionado conforme manuseia a lâmina. \nVocê agora causa dano perfurante.");
            this.tipoDano = "Perfurante";
        }
        else if(elementoDano.equals(Elemento.TERRA)){
            System.out.println("Sua arma é imbuída com o elemento da terra, você sente a densidade da arma aumentar consideravelmente...mas ao mesmo tempo ela ter ficado mais leve para você manusear.\nVocê agora causa dano de pancada.");
            this.tipoDano = "Pancada";
        }
        else if(elementoDano.equals(Elemento.AGUA)){
            System.out.println("Sua arma é imbuída com o elemento da água, você não tem certeza do que aconteceu, mas sua arma parece ter ficado mais calma e estável, assim como sua mente.");
            this.hitPoints = this.hitPoints +50;
            this.tipoDano = "Aquático";
        }
    }

    public void atacarMonstro(Monstro monstro){
        String[] listaAtaques ={"Ataque Normal","Machado Atômico - 8MP", "Investida Furiosa - 12MP"};
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
                if(this.magicPoints<=8){
                    System.out.println("Você não tem mana suficiente para usar este ataque.");
                    continue;
                }
                else{
                    System.out.println("Você murmura o único feitiço que conhece e lança seu machado em direção ao inimigo. Uma pequena explosão ocorre assim que a arma o acerta.");
                    this.magicPoints = this.magicPoints-8;
                    this.dano +=15;
                    monstro.apanhar(this);
                    this.dano -=15;
                    break;
                }
            }else if (opcao==3){
                if(this.magicPoints<=12){
                    System.out.println("Você não tem mana suficiente para usar este ataque.");
                    continue;
                }
                else{
                    System.out.println("Enraivecido, você se lança furiosamente em direção ao inimigo, causando grande dano ao monstro e a si mesmo.");
                    this.magicPoints = this.magicPoints-12;
                    this.dano +=30;
                    monstro.apanhar(this);
                    this.dano -=30;
                    sofrerDano(15);
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
        this.magicPoints = 50;
        if(elementoDano.equals(Elemento.AGUA))
            this.hitPoints = 350;
        else
            this.hitPoints = 300;
        setAtordoado(false);
        setContadorAtordoado(0);
        setEnvenenado(false);
        setContadorEnvenenado(0);
        setSangrando(false);
        setContadorSangrando(0);
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
                this.dano = 70;
            }
        }
    }
    public void apresentarHeroi(){

        InputStream ins = null; // raw byte-stream
        Reader r = null; // cooked reader
        BufferedReader br = null; // buffered for readLine()
        try {
            String s;
            ins = new FileInputStream("C:\\Users\\Felipe\\IdeaProjects\\LetsCode\\src\\Aula10_POO\\Ascii\\ascii_orc.txt");
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

        System.out.println("Você decidiu cedo na vida que não há nenhum problema que seus bíceps gigantes não possam resolver.\nAfinal, todo mundo que você já enfrentou tinha  um plano até você enfiar um soco na cara deles.");
        System.out.println("Você tem maior vitalidade e causa maior dano, além de não poder ser atordoado, já que não tem muito na cabeça para poder atordoar.");

    }


    @Override
    public String toString() {
        return "HeroiBarbaro{" +
                "\nPontos de Vida=" + hitPoints +"/350"+
                "\nQuantidade de dano=" + dano +"/70"+
                "\nTipo de Dano='" + tipoDano + '\'' +
                "\nElemento =" + elementoDano +
                "\nEnvenenado=" + envenenado +
                "\nSangrando=" + sangrando +
                "\nAtordoado=" + atordoado +
                "\nMonstros Derrotados=" + monstrosDerrotados +
                "\n}";
    }
}