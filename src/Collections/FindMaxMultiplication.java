package Collections;
import java.util.Arrays;
import java.util.HashMap;

public class FindMaxMultiplication {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,4};
        findMaxMultiplicationValue(arr);
    }
    public static void findMaxMultiplicationValue(int[] arr){
        int[]multp= new int[arr.length-1];
        for(int i=0; i<arr.length-1;i++){
            multp[i]=arr[i]*arr[i+1];
        }
        System.out.println(Arrays.toString(multp));
int index=0;
int max=multp[0];
for(int i=1;i<multp.length;i++){
     if(multp[i]>max){
        max=multp[i];
         index++;
          }

}
        HashMap<Integer, Integer>mm=  new HashMap<>();
        mm.put(index,max);
        System.out.println(mm);

    }
}
