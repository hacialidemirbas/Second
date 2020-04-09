package Arrays;

public class ForEachArray {
    public static void main(String[] args) {
        int[] arrayInt={1,2,3,4,5,6,7,8,9};
        String[] stringArray={"Hello","Java","It","is","good","to","see","you"};
        for(int number:arrayInt){
            System.out.println(number);
        }
        for(String word:stringArray){
            System.out.println(word);
        }
    }
}
