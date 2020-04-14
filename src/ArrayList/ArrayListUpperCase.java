package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUpperCase {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>java=new ArrayList<>();
        java.add(new ArrayList<>());
        java.get(0).addAll(Arrays.asList("Java","is","fun"));
        java.add(new ArrayList<>());
        java.get(1).addAll(Arrays.asList("Java","is","Super"));
        System.out.println(java);
        upperCase(java);
        lowerCase(java);
    }
    public static void upperCase(ArrayList<ArrayList<String>>arr){
        for(int i=0; i<arr.size();i++){
            int index=0;
            for(int j=0;j<arr.get(i).size();j++){
                if (arr.get(i).get(j).charAt(0)>='A'&&arr.get(i).get(j).charAt(0)<='Z'){
                    index++;
                }
            }
            System.out.println(index);
        }
    }
    public static void lowerCase(ArrayList<ArrayList<String>>arr){
        for(int i=0; i<arr.size();i++){
            int countrow=0;
            for(int j=0;j<arr.get(i).size();j++){
                int countword=0;
                for (int k=0; k<arr.get(i).get(j).length();k++){
                    if (arr.get(i).get(j).charAt(k)>='a'&&arr.get(i).get(j).charAt(k)<='z'){
                        countword++;
                }

            }
                System.out.println("There are "+countword+" in "+ arr.get(i).get(j));
                countrow+=countword;

                }
            System.out.println("There are "+countrow+" lower cases at row"+(i+1));
            }

        }
}
