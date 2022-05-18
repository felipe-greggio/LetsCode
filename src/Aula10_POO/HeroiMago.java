package Aula10_POO;

import java.io.*;
import java.util.Scanner;

public class HeroiMago extends HeroiGenerico {



    Scanner scan = new Scanner(System.in);

    public HeroiMago(){
        this.hitPoints = 120;
        this.magicPoints = 200;
        this.dano = 30;
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
        this.elementoDano = HeroiGenerico.Elemento.valueOf(elemento);
        if(elementoDano.equals(HeroiGenerico.Elemento.FOGO)){
            this.tipoDano = "Fogo";
        }
        else if(elementoDano.equals(HeroiGenerico.Elemento.AR)){
            this.tipoDano = "Perfurante";
        }
        else if(elementoDano.equals(HeroiGenerico.Elemento.TERRA)){
            this.tipoDano = "Pancada";
        }
        else if(elementoDano.equals(HeroiGenerico.Elemento.AGUA)){
            this.hitPoints = this.hitPoints +50;
            this.tipoDano = "Aquático";
        }
    }

    public void atacarMonstro(Monstro monstro){
        String[] listaAtaques ={"Ataque Normal","Orbe da dor - 10 MP", "Horror Cósmico - 18 MP", "Curar - 6 MP"};
        int opcao = 0;
        while(true){
            System.out.println();
            System.out.println("Escolha seu ataque: \n1- "+listaAtaques[0]+"\n2- "+listaAtaques[1]+"\n3- "+listaAtaques[2]+"\n4- "+listaAtaques[3]);
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
                    System.out.println("Você sacode um pouco seus braços e lança uma gigantesca orbe em direção ao monstro. Você aparenta estar levemente entediado enquanto ouve os gritos de agonia do monstro.");
                    this.magicPoints = this.magicPoints-7;
                    this.dano +=40;
                    monstro.apanhar(this);
                    this.dano -=40;
                    break;
                }
            }else if (opcao==3){
                if(this.magicPoints<14){
                    System.out.println("Você não tem mana suficiente para usar este ataque.");
                    continue;
                }
                else{
                    System.out.println("Você até mesmo se prepara para poder lançar o próximo feitiço, ele é poderoso na mesma proporção que é proibido. \nVocê murmura rapidamente os encantamentos e uma fenda no espaço-tempo se abre, puxando o monstro para dentro, você sente ele gritar de dor e agonizar, conforme seu corpo e mente enfrentam o horror do cosmos.");
                    this.magicPoints = this.magicPoints-14;
                    this.dano +=65;
                    monstro.apanhar(this);
                    this.dano -=65;
                    break;
                }
            }else if (opcao==4) {
                if (this.magicPoints < 6) {
                    System.out.println("Você não tem mana suficiente para se curar.");
                    continue;
                } else {
                    System.out.println("Você recita uma breve incantação e seus ferimentos magicamente vão embora.");
                    this.magicPoints = this.magicPoints - 6;
                    this.hitPoints += 40;
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
        if(elementoDano.equals(HeroiGenerico.Elemento.AGUA))
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
                this.dano = 30;
            }
        }
    }
    public void apresentarHeroi(){

        InputStream ins = null; // raw byte-stream
        Reader r = null; // cooked reader
        BufferedReader br = null; // buffered for readLine()
        try {
            String s;
            ins = new FileInputStream("C:\\Users\\Felipe\\IdeaProjects\\LetsCode\\src\\Aula10_POO\\Ascii\\ascii_mage.txt");
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

        System.out.println("O mundo está a beira da destruição...você poderia criar outro mundo ou pular de dimensão, mas, honestamente, você acha que isso seria mais trabalhoso do que simplesmente destruir todos os monstros e salvar o mundo.");
        System.out.println("Você é velho e fraco, mas seu conhecimento da magia e poder são inigualáveis.");

    }


    @Override
    public String toString() {
        return "Mago Humano{" +
                "\nPontos de Vida=" + hitPoints +"/120"+
                "\nMana=" + magicPoints+"/200"+
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
