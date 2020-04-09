package OCA;

import java.util.Arrays;

public class swappingArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        System.out.println("my original array: "+Arrays.toString(array));
        for(int i=0; i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
        System.out.println("my reversed array: "+Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            int reversedArray=array.length-i;
            System.out.print(reversedArray);
        }


    }
}
