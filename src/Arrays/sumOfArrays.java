package Arrays;

public class sumOfArrays {
    public static void main(String[] args) {
        int sum=0;
        int[] myNumbers={1,2,3,4,5,6,7,8};
        for (int i=0; i<myNumbers.length;i++){
            sum+=myNumbers[i];
        }
        System.out.println(sum);

    }
}
