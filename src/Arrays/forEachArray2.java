package Arrays;

public class forEachArray2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*1000);

        }
        for(int number:arr){
            System.out.println(number);

        }
    }
}
