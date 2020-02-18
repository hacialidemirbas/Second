package MD_February15;

public class LoopNumbers {
    public static void main(String[] args) {
        //1 2 3 4 5 and repeat version for loop implementation
        int number=2;

        for(int i=1 ; i<5 ; i++){

            for(int j=1 ; j<7 ; j++){
                if(number>17 && number<23){
                    System.out.print(" " + "\t");
                }
                else {
                    System.out.print(number+"\t");
                }
                number+=2;
            }

            System.out.println();

        }
    }
}
