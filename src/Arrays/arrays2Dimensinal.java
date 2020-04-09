package Arrays;

public class arrays2Dimensinal {
    public static void main(String[] args) {
        int [][]arr= new int[3][3];
        int counter=1;// to insert numbers 1-9
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=counter;// assigning number to current element (cell)
                counter++;
            }
        }
        //to print all element of the arr
        for(int i=0;i<arr.length;i++){
            for(int number:arr[i]){// for every iteration of outer loop it will return an array
                System.out.print("\t\t"+number);
            }
            System.out.println();
        }

    }
}
