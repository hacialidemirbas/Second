package Package16F;

public class LetterLoopa_u {
    public static void main(String[] args) {
        char letter='a';

        for (int i=1; i<6;i++){
            System.out.print(i);

            for(int j=0;j<4;j++){
                System.out.print(letter);
                letter++;

            }
            System.out.println();
        }
    }
}
