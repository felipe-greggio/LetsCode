package Aula10_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master {

    public static void main(String[] args) {

        List<Generico> listaMonstros = new ArrayList<>();
        int batalhas=0;


        Generico generico = new Generico();
        Generico vampiro = new Vampiro();
        Generico cobra = new Cobra();
        Generico gigante = new Gigante();
        listaMonstros.add(generico);
        listaMonstros.add(cobra);
        listaMonstros.add(gigante);
        listaMonstros.add(vampiro);

        Jogo.desenharIntro();
        HeroiGenerico heroi = Jogo.escolherClasse();
        Jogo.escolherELemento(heroi);

        for(Generico monstro: listaMonstros){
            monstro.apresentarMonstro();
            Jogo.batalha(heroi, monstro);
            if(heroi.isVivo()==false) {
                break;
            }
            batalhas++;
            if(batalhas%2==0 && batalhas<4){
                Jogo.fogueira(heroi);
            }
        }
        if (heroi.isVivo()){
            heroi.setVencedor(true);
            Jogo.ganhouJogo();
        }
        else{
            Jogo.perdeuJogo();
        }
    }
}