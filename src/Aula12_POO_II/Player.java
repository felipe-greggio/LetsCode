package Aula12_POO_II;

import java.util.ArrayList;

public class Player {
    private int life;
    private ArrayList<Card> playerDeck;

    public int getLife(){
        return life;
    }

    public ArrayList<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void addCard(Card card){
        playerDeck.add(card);
    }
}
