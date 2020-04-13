package ArrayList;

import java.util.ArrayList;

public class FindSameDifferences {
    public static void main(String[] args) {
        int myNums[] = {6,6,6,6,6,6,6,6,8,12,20};
        System.out.println(findSameDifferences(myNums));
    }
    public static ArrayList<Integer> findSameDifferences(int[] arr){
        ArrayList<Integer> diffs = new ArrayList<>();
        for(int i=0 ; i< arr.length ; i++){
            for(int j=i+1 ; j<arr.length;j++){
                diffs.add(Math.abs(arr[i]-arr[j]));
            }
        }
        diffs = findDuplicates(diffs);
        return diffs;
    }
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=i+1 ; j<arr.size();j++){
                if( arr.get(i).equals( arr.get(j) ) && !duplicates.contains(arr.get(i)) ){
                    duplicates.add(arr.get(i));
                }
            }
        }
        return duplicates;
    }
}



