package Aula12_POO_II;

import java.util.ArrayList;

public abstract class Board {



    protected abstract void receiveDeck(ArrayList<Card> deck);
    protected abstract boolean HasWinner();
    protected abstract boolean canPlayAttackCard(Player player, AttackCard attackCard);
    protected abstract void registerPlayer(Player player);



}
