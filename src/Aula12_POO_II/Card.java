package Aula12_POO_II;

enum Type{ ATTACK, SPECIAL }

public abstract class Card {

    protected String name;
    protected Type type;
    protected int cost;

    protected abstract String getName();
    protected abstract Type getType();
    protected abstract int getCost();

}
