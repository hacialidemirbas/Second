package MD_February19;

public class TriangleWhile {
    public static void main(String[] args) {
        int i=1;
        int j;
        while(i<20){
            j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
