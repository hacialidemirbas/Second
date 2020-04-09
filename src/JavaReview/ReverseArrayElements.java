package JavaReview;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[]numbers={10,9,8,7,6,5,4,3,2,1};
        System.out.println("Arrays before reverse: ");
        for (int num:numbers){
            System.out.print(num+" ");
        }
        for(int i=0; i<numbers.length/2;i++){
            int box=numbers[i];;
           numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=box;

        }
        System.out.println();
        System.out.println("Array after reverse: ");
        for(int val:numbers){
            System.out.print(val+" ");
        }
    }
}
