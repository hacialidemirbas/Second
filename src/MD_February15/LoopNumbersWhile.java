package MD_February15;

public class LoopNumbersWhile {
    public static void main(String[] args) {
        int number=1;
        int counter;
        for(int i=1 ; i<=3 ; i++){
            counter=1;
            while(counter<6){
                if( number%3==0 ) {
                    System.out.print(" " + "\t\t");
                }
                else {
                    System.out.print(number + "\t\t");
                }
                counter++;
                number++;
            }
            System.out.println();
        }
    }
}
