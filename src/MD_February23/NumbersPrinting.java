package MD_February23;

public class NumbersPrinting {
    public static void printNums(){
        int number=1;
        for(int i=0 ; i<3 ; i++){
            for(int j=0;j<5;j++){
                System.out.print(number+"\t\t");
                number++;
            }
            System.out.println();
        }
    }
}
