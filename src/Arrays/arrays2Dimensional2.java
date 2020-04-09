package Arrays;

public class arrays2Dimensional2 {
    public static void main(String[] args) {
        int [][] array={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*1000);
            }
        }
        for (int numberarray[]:array){
            for(int number:numberarray){
                System.out.println(number);

            }
        }


    }
}
