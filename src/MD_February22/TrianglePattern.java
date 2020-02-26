package MD_February22;

public class TrianglePattern {
    public static void main(String[] args) {
        for (int i=0; i < 20 ; i++){
            //for loop for the spaces
            for(int j=0 ;j<20-i ;j++){
                System.out.print(" ");
            }
            //for loop for stars
            for(int k=0 ; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
