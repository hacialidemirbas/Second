package MD_February22;

public class HourGlassNumbers {
    public static void main(String[] args) {
        //variable for the number of lines
        int lines=9;
        for(int i=1 ; i<lines ; i++){
            //to print spaces
            for (int j=1 ; j<=i ; j++){
                System.out.print("-");
            }
            //to print numbers triangle
            for(int k=i ; k<lines ; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
