package JavaReview;

public class Main {
    public static void main(String[] args) {
        int []arr1=new int [50];
        System.out.println("arr1: "+arr1);
        int []arr2= new int [100];
        System.out.println("arr2: "+arr2);
        arr1=arr2;
        System.out.println(arr1.length);
        String[] arr={"apple","pears"};
        System.out.println();

    }
}
