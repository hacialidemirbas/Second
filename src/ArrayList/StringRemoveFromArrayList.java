package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringRemoveFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> orr= new ArrayList<String> (Arrays.asList("abc","sdf","fgh","ert"));
        System.out.println(removingString(orr));

    }
    public static ArrayList<String> removingString(ArrayList<String> str){
        ArrayList<String> removed= new ArrayList<>();
       /* for(int i=0;i<str.size();i++){
            if(!str.get(i).contains("a")&&!str.get(i).contains("e")&&!str.get(i).contains("i")){
                removed.add(str.get(i));
            }*/
        for ( String word : str ){
            if( !(word.contains("a") || word.contains("e") || word.contains("i")) ){
                removed.add(word);


            }
        }
        return removed;
    }
}
