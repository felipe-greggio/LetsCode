package Aula12_POO_II;

import java.util.ArrayList;

public class Versus extends Board{

    private ArrayList<Card> deck1;
    private ArrayList<Card> deck2;
    private Player player1;
    private Player player2;
    private ArrayList<AttackCard> side1Attack;
    private ArrayList<AttackCard> side2Attack;



    @Override
    protected void receiveDeck(ArrayList<Card> deck) {
        if (deck.size()==50){
            if(deck1.size()==50 && deck2.isEmpty()){
                this.deck2 = deck;
            }
            else if (deck1.isEmpty()){
                this.deck1 = deck;
            }
            else{
                System.out.println("Decks already registered");
            }
        }else{
            System.out.println("Deck with insufficient cards");
        }
    }

    protected void registerPlayer(Player player){
                if(player1 == null && player2 == null){
                    this.player1 = player;
                }else if(player2 == null && player1 != null){
                    this.player2 = player;
                }else{
                    System.out.println("Players already registered");
                }

    }

    @Override
    protected boolean HasWinner() {
        if (player1.getLife() == 0 || player2.getLife() == 0){
            return true;
        }
        return false;
    }

    @Override
    protected boolean canPlayAttackCard(Player player, AttackCard attackCard) {
        int attackCards = 0;
        int specialCards = 0;
        if (player == player1 && this.deck1.size() < 7){
            for (Card cards : deck1){
                if (attackCard instanceof AttackCard){
                    attackCards++;
                }else if(attackCard instanceof SpecialCard){
                    specialCards++;
                }
            }
            if(attackCard instanceof AttackCard && attackCards<5){
                side1Attack.add(attackCard);
                return true;
            }else if(attackCard instanceof SpecialCard && specialCards<2){
                side1Attack.add(attackCard);
                return true;
            }
        }
        if (player == player2 && this.deck2.size() < 7){
            for (Card cards : deck2){
                if (attackCard instanceof AttackCard){
                    attackCards++;
                }else if(attackCard instanceof SpecialCard){
                    specialCards++;
                }
            }
            if(attackCard instanceof AttackCard && attackCards<5){
                side2Attack.add(attackCard);
                return true;
            }else if(attackCard instanceof SpecialCard && specialCards<2){
                side2Attack.add(attackCard);
                return true;
            }
        }
        System.out.println("Card slots already full");
        return false;
    }
}
