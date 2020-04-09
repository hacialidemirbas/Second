package Arrays;

public class cutArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrayLen= array.length;
        //to find in the middle
        int half=arrayLen/2;
        //int firstHalf[]= new int[half];
        for (int i = 0; i <= half; i++) {
            System.out.print(array[i]);
            }
        System.out.println();

        for (int i=half+1;i<arrayLen;i++){
            System.out.print(array[i]);

        }



        }

        }
