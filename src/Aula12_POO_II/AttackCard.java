package Aula12_POO_II;

public class AttackCard extends Card{

    protected int power;
    protected int resistance;

    protected int getPower(){
        return power;
    }

    protected int getResistance(){
        return resistance;
    }

    @Override
    protected String getName() {
        return null;
    }

    @Override
    protected Type getType() {
        return null;
    }

    @Override
    protected int getCost() {
        return 0;
    }
}
