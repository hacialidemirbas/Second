package March9;

public class twoDimColRows {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=twoDimRowsCols(arr);
        for(int row[]:result){
            for(int number:row){
                System.out.print("\t"+number);
            }
            System.out.println();
        }

    }
    public static int[][] twoDimRowsCols(int [][]arrays){
        int [][]rowColToColRow=new int[arrays.length][arrays[0].length];
        for(int i=0; i<arrays.length;i++){
            for(int j=0;j<arrays[i].length;j++){
                rowColToColRow[j][i]=arrays[i][j];
            }
        }
        return rowColToColRow;
    }
}



