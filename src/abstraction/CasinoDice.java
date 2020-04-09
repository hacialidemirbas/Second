package abstraction;

public class CasinoDice extends Dice {
    public int rollDice(){
        int result=(int)(Math.random()*faces+1);
        return result;
    }
}
