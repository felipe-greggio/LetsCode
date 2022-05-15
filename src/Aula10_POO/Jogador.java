package Aula04_POO;



public class Jogador {

    private int hitPoints;
    private int dano;
    private String tipoDano;
    private Elemento elementoDano;
    private boolean envenenado;
    private int contadorEnvenenado;
    private boolean sangrando;
    private int contadorSangrando;
    private boolean atordoado;
    private int contadorAtordoado;
    private boolean vivo;
    private boolean vencedor;
    private int monstrosDerrotados;


    private enum Elemento {FOGO, TERRA, AR, AGUA}

    public Jogador(){
        this.hitPoints = 300;
        this.dano = 70;
        this.contadorEnvenenado = 0;
        this.contadorSangrando = 0;
        this.contadorAtordoado = 0;
        this.vivo = true;
        this.monstrosDerrotados=0;

    }

    public void sofrerDano(int dano) {
        this.hitPoints = this.hitPoints-dano;
        if (this.hitPoints<=0){
            System.out.println("Você tomou muito dano e não aguentou. Você sente suas forças indo embora, então é assim que é morrer?. \nAs forças do mal tomam controle e você é esquecido pela história.");
            this.morrer();
            return;
        }
        System.out.println("Você ainda tem "+this.hitPoints+" pontos de vida.");
    }

    public int getDano() {
        return dano;
    }

    public boolean isVivo() {
        return vivo;
    }
    public void morrer(){
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

    public int getContadorEnvenenado() {
        return contadorEnvenenado;
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

    public int getContadorSangrando() {
        return contadorSangrando;
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

    public int getContadorAtordoado() {
        return contadorAtordoado;
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
            System.out.println("Seus punhos são imbuídos com o elemento do fogo, seus punhos flamejam com poder. \nVocê agora causa dano de fogo");
            this.tipoDano = "Fogo";
        }
        else if(elementoDano.equals(Elemento.AR)){
            System.out.println("Sua arma é imbuída com o elemento do ar, você fica impressionado conforme manuseia a lâmina. \nVocê agora causa dano perfurante");
            this.tipoDano = "Perfurante";
        }
        else if(elementoDano.equals(Elemento.TERRA)){
            System.out.println("Sua arma é imbuída com o elemento da terra, você sente a densidade da arma aumentar consideravelmente...mas ao mesmo tempo ela ter ficado mais leve para você manusear.\nVocê agora causa dano de pancada");
            this.tipoDano = "Pancada";
        }
        else if(elementoDano.equals(Elemento.AGUA)){
            System.out.println("Sua arma é imbuída com o elemento da água, você não tem certeza do que aconteceu, mas sua arma parece ter ficado mais calma e estável, assim como sua mente.");
            this.hitPoints = this.hitPoints +50;
            this.tipoDano = "Aquático";
        }
    }

    public void sofrerCondicao(){
        if(this.isSangrando() == true && this.isVivo() == true){
            System.out.println("Você está perdendo sangue rapidamente, você se sente enfraquecido e perde 10 pontos de vida");
            sofrerDano(10);
        }
        if(this.isEnvenenado() == true && this.isVivo() == true){
            System.out.println("Você sente suas entranhas pegando fogo por conta do veneno, isso está te matando, você perde 15 pontos de vida");
            sofrerDano(15);
        }
        if(this.isAtordoado() == true && this.isVivo() == true){
            System.out.println("Você está atordoado e não consegue focar no inimigo ou manter o equilíbrio, você causa 30% menos de dano");
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

}