package Arrays;
import java.util.Arrays;
public class Exercises {
    public static void main(String[] args) {
        int[]a=new int [10];
        a[9]=100;
        System.out.print(Arrays.toString(a));
        System.out.println(a.length);
        a[9]=3;
        System.out.println(Arrays.toString(a));
        a[9]+=5;
        System.out.println(a[9]);
        printArray();
        int x[]={1,2,3,4,5};
        int y[]={5,4,3,2,1};
        System.out.println(isReverse(x,y));
        reverse(y);
    }
    public static void printArray(){
        int[]inventory={1,2,3,4,5};
        System.out.println(Arrays.toString(inventory));
    }
    public static boolean isReverse(int[]arr1, int []arr2){
        boolean result=false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[arr2.length-i-1]){
                result= true;}
            else{
                result = false;
                break;
            }
        }

        return result;
        
    }
    public static void reverse(int[]arr){
        int temp=0;
        for(int i=0; i<arr.length/2; i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
