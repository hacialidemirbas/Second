package abstraction;

public class DarkCasinoDice extends CasinoDice {
    public int rollDice(){
        return (int) ((Math.random()*10)+1);
    }
}
