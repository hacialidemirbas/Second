package Package19F;

public class StarsLoopWhile {
    public static void main(String[] args) {
        int i=10;
        while(i>0){
            int j=10;
            while(j>0){
                System.out.print("*    ");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
