package JavaReview;

public class findDublicateArray {
    public static void main(String[] args) {
        String[] array={"abc","acb","adc","bca","acb"};
        printDublicates(array);
    }
    public static void printDublicates (String[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr [j].equals(arr[i])&&i!=j){
                    System.out.println(arr[j]);

                }
            }
        }
    }
}
