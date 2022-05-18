package Aula10_POO;

public abstract class HeroiGenerico {

    protected int hitPoints;
    protected int magicPoints;
    protected int dano;
    protected String tipoDano;
    protected HeroiGenerico.Elemento elementoDano;
    protected boolean envenenado;
    protected int contadorEnvenenado;
    protected boolean sangrando;
    protected int contadorSangrando;
    protected boolean atordoado;
    protected int contadorAtordoado;
    protected boolean vivo;
    protected boolean vencedor;
    protected int monstrosDerrotados;

    protected enum Elemento {FOGO, TERRA, AR, AGUA}


    public abstract void sofrerDano(int dano);
    public abstract int getDano();
    public abstract int getHitPoints();
    public abstract int getMagicPoints();
    public abstract String getTipoDano();
    public abstract void setElementoDano(String elemento);

    public abstract void sofrerCondicao();
    public abstract void limparCondicao();

    public abstract void atacarMonstro(Monstro monstro);
    public abstract void meditar();
    public abstract void recuperarCompletamente();
    public abstract  void aumentarDano();

    public abstract void incrementarMonstrosDerrotados();
    public abstract int getMonstrosDerrotados();

    public abstract void morrer();
    public abstract boolean isVivo();

    public abstract boolean isEnvenenado();
    public abstract void setEnvenenado(boolean envenenado);
    public abstract void setContadorEnvenenado(int contadorEnvenenado);

    public abstract boolean isSangrando();
    public abstract void setSangrando(boolean sangrando);
    public abstract void setContadorSangrando(int contadorSangrando);

    public abstract boolean isAtordoado();
    public abstract void setAtordoado(boolean atordoado);
    public abstract  void setContadorAtordoado(int contadorAtordoado);

    public abstract boolean isVencedor();
    public abstract void setVencedor(boolean vencedor);

    public abstract String toString();
}

