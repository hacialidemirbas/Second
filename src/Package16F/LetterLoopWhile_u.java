package Package16F;

public class LetterLoopWhile_u {
    public static void main(String[] args) {
        int number=1;
        int count;
        char letter='a';
        while(number<6){
            count=1;

            System.out.print(number);
            while(count<5){
                System.out.print(letter);
                letter++;
                count++;

            }
            System.out.println();

            number++;
        }
    }
}
