package Exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> orrArrayList= new ArrayList<String>(Arrays.asList("Apple","Orange","Pears","Cherry"));
        System.out.println(Arrays.toString(ListToArray(orrArrayList)));



    }
    public static String[]ListToArray(ArrayList<String> arr){
        String[]arrString=new String[arr.size()];
        for(int i=0;i<arrString.length;i++){
            arrString[i]=arr.get(i);
        }
        return arrString;

    }
}
