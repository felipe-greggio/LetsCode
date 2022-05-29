package Aula12_POO_II;

import java.util.ArrayList;

public class Party extends Board{

    private ArrayList<Card> deck1;
    private ArrayList<Card> deck2;
    private ArrayList<Card> deck3;
    private ArrayList<Card> deck4;
    private ArrayList<Card> deck5;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private ArrayList<AttackCard> attackBoard;

    @Override
    protected void receiveDeck(ArrayList<Card> deck) {
        if (deck.size() == 80){
            if (deck1.isEmpty()){
                this.deck1 = deck;
            }else if (deck2.isEmpty()){
                this.deck2 = deck;
            }else if (deck3.isEmpty()){
                this.deck3 = deck;
            }else if (deck4.isEmpty()){
                this.deck4 = deck;
            }else if (deck5.isEmpty()){
                this.deck5 = deck;
            }
        }
        System.out.println("Decks already registered");

    }

    @Override
    protected boolean HasWinner() {
        if(player1.getLife() != 0 || player2.getLife() != 0 || player3.getLife() != 0 || player4.getLife() != 0 ||player5.getLife() != 0) {
            return false;
        }
        return true;
    }

    @Override
    protected boolean canPlayAttackCard(Player player, AttackCard attackCard) {
        if(this.attackBoard.size() < 34){
            this.attackBoard.add(attackCard);
            return true;
        }
        System.out.println("Attack slots already full");
        return false;
    }

    @Override
    protected void registerPlayer(Player player) {
        if (player1 == null){
            this.player1 = player;
        }else if (player2 == null){
            this.player2 = player;
        }else if (player3 == null){
            this.player3 = player;
        }else if (player4 == null){
            this.player4 = player;
        }else if (player5 == null){
            this.player5 = player;
        }else {
            System.out.println("Players already registered");
        }
    }
}
