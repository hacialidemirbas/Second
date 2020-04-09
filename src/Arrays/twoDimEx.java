package Arrays;

public class twoDimEx {
    public static void main(String[] args) {
        int[][] twoarr=new int[10][5];
        for(int i =0; i<twoarr.length;i++){
            for(int j=0;j<twoarr[i].length;j++){
                twoarr[i][j]=i;
                System.out.print("  "+twoarr[i][j]);
            }
            System.out.println();
        }

    }
}
