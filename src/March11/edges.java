package March11;

public class edges {
    public static void main(String[] args) {
        int [][] arr={{0,18,238,255,248},
                {0,87,255,255,255},
                {0,75,255,255,249},
                {0,39,255,255,255},
                {0,67,255,255,239}};
        for(int row[]:arr){
            for(int number:row){
                System.out.print("\t\t"+number);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        findEdges(arr);
    }
    public static void findEdges(int [][]arr){
        int diffs[][]=new int [arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                diffs[i][j]=Math.abs(arr[i][j]-arr[i][j-1]);
            }
        }
        for (int row[]:diffs){
            for(int num:row ){
                System.out.print("\t\t"+num);


            }
            System.out.println();
        }
        int max;
        for(int i=0; i>diffs.length;i++){
            max=diffs[i][0];
            for(int j=0; j<diffs[i].length;j++){
                if(diffs[i][j]>max){
                    max=diffs[i][j];
                }

            }
            System.out.println("Max value of the row: "+i+" is "+max);
        }


    }
}
