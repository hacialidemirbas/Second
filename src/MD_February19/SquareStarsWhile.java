package MD_February19;

public class SquareStarsWhile {
    public static void main(String[] args) {
        int i=30;
        int j;
        while(i<=40){
            j=5;
            while(j<15){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
