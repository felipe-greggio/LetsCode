package Aula07_POO;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {

    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;
    int treinos;

    public Jogador(){

    }

    Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho, boolean suspenso){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    public void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmarelos +=quantidade;
        this.verificarCondicaoDeJogo();
    }

    public void aplicarCartaoVermelho(){
        this.cartaoVermelho = 1;
        this.verificarCondicaoDeJogo();
    }

    public boolean verificarCondicaoDeJogo(){
        if(this.cartaoVermelho>=1 || this.cartoesAmarelos>=3)
            this.suspenso = true;
        if (this.suspenso == true){
            return false;
        }
        else{
            return true;
        }
    }

    public void cumprirSuspensao(){
        this.cartoesAmarelos = 0;
        this.cartaoVermelho = 0;
        this.suspenso = false;
    }

    public void sofrerLesao(){
        int temp = this.qualidade;
        Random random = new Random();
        double probabilidade = random.nextInt(100);

        if (probabilidade < 5){
            System.out.println("Lesão crítica");
            this.qualidade -= this.qualidade * (3/20);
        }
        else if (probabilidade >= 5 && probabilidade < 15){
            System.out.println("Lesão gravíssima");
            this.qualidade -= this.qualidade/10;
        }

        else if (probabilidade >= 15 && probabilidade < 30) {
            System.out.println("Lesão grave");
            this.qualidade -= this.qualidade / 20;
        }
        else if (probabilidade >= 30 && probabilidade < 60){
            System.out.println("Lesão média");
            this.qualidade -= 2;
            if (this.qualidade<0)
                this.qualidade = 0;
        }
        else if (probabilidade >= 60){
            System.out.println("Lesão leve");
            this.qualidade -= 1;
            if (this.qualidade<0)
                this.qualidade = 0;
        }
        System.out.println("A qualidade deste jogador decaiu, de "+temp+" para "+this.qualidade+".");
    }

    public void executarTreinamento(){
        if (this.treinos <1){
            int temp = this.qualidade;
            this.qualidade += (int) ((Math.random() * (3 - 1)) + 1);
            System.out.println("A qualidade deste jogador aumentou, de "+temp+" para "+this.qualidade+".");
        }
        else
            System.out.println("Este jogador já treinou antes da partida");
    }

    @Override
    public String toString() {
            return posicao+": "+numero+" - "+nome+" ("+apelido+") - "+dataNascimento+" CONDIÇÃO: "+(this.verificarCondicaoDeJogo()?"PODE JOGAR":"NÃO PODE JOGAR");
    }
}

