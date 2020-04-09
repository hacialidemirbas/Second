package Interface;

public class DiceBiasTest {
    public static void main(String[] args) {
        DiceBias myBias = new DiceBias(8);
        myBias.roll();
        myBias.rollTwice();
        myBias.rollTriple();
        //myBias.biasedRoll();
        myBias.setBiasFactor(3);
        for (int i = 0; i < 10 ; i++) {
            myBias.biasedRoll();
        }
  }
}