package Package19F;

public class TriangleRightAligned {
    public static void main(String[] args) {
        for(int i=10;i>0;i--){
            for(int j=1;j<=i;j++){

                System.out.print("  ");
            }
            for(int k = 10; k>=i ; k--){

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
