package MD_February10th;

public class OddNumbersHundred {
    public static void main(String[] args) {
        for(int i=1 ; i<101 ; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        for (int i=0 ; i<=100 ; i=i+2){
            System.out.println(i);
        }
    }
}
