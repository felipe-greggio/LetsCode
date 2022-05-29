package Aula12_POO_II;


enum Effects {
    CHARGE, FIRE, STAMPEDE
}

public class SpecialCard extends AttackCard {

    private Effects effect;

    public Effects getEffect(){
        return effect;
    }


}
