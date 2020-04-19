package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class SumOfNumbers {
    public static void main(String[] args) {
        LinkedList<String> myNums=new LinkedList<>(Arrays.asList("5 apple","3 pears","4 plums"));
        int digit;
        int sum=0;
        String x="";
        for( String word:myNums){
            for(int j=0; j<word.length();j++){
                System.out.print(word.charAt(j)+" ");
                if(Character.isDigit(word.charAt(j))){
                    x+=word.charAt(j);
                    digit=Integer.parseInt(x);
                    sum+=digit;
                    x="";
                }
            }
        }
        System.out.println();
        System.out.println(sum);
        findDigits(myNums,true);
    }
    public static void findDigits(LinkedList<String> arr,boolean x){
        int total=0;
        int value;
        for(String word : arr){ //fetch the words
            for(int i=0 ; i<word.length() ; i++){ //to fetch chars
                if(Character.isDigit(word.charAt(i))){
                    value=word.charAt(i)-48;
                    total+=value;
                }
            }
        }
        System.out.println(total);

    }

}
