package OCA;

import java.util.Arrays;

public class ToDeleteIntNumInArray {
    public static void main(String[] args) {
        int []source={2,4,6,8,10,2,3,4,2,1,7,8,2};
        int counter=0;
        int numTodel=2;
        for(int i=0;i<source.length;i++){
            if(numTodel==source[i]){
                counter++;


            }

        }
        System.out.println(counter);
        int[]newArr=new int [source.length-counter];
        for(int i=0, j=0;i<source.length;i++){
            //int j=0;
            if(source[i]!=numTodel){
                newArr[j]=source[i];
                j++;
            }


        }
        System.out.println(Arrays.toString(newArr));

    }
}
