package abstraction;

import java.util.Random;

abstract class Dice {
    final int faces = 6;
    abstract int rollDice();
    public void rollTwice(){
        Random myRandom= new Random();
        int result= (int) (Math.random()*faces+1);
        System.out.println(result);
    }
}
