package MD_February15;

public class LoopNumbersAndLetters {
    public static void main(String[] args) {
        for(int i=1 ; i<6 ; i++){
            System.out.print(i);
            for(char letter='a' ; letter!='e' ; letter++){
                System.out.print("\t"+letter+"\t");
            }
            System.out.println();
        }
    }
}
