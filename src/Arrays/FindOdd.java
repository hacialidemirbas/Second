package Arrays;

public class FindOdd {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10,11};
        int sum=0;
        for(int i=0; i<numbers.length;i++){
            if (numbers[i]%2==1){
                sum=sum+numbers[i];
                System.out.println(numbers[i]);
            }
        }
        //to find total number of odd numbers
        System.out.println("Sum of odd numbers: "+sum);
        int counter=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2!=0){
                counter++;
            }
        }
        System.out.println("Total number of odd numbers: "+counter);
    }
}
