package JavaReview;

public class compareArrays {
    public static void main(String[] args) {
        int[] arr1 = {44, 56, 89};
        int[] arr2 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1.equals(arr2)) {
                System.out.println("Same");
            } else {
                System.out.println("Not same");
            }

        }
    }
}
