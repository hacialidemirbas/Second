package Exercises;
import java.lang.System.*;
// count consonants
public class ex9m1 {
    public static void main(String[] args) {
        String myString="Java is my sweetheart";
        int count=0;
        String cons =" ";
        for(int i=0; i<myString.length();i++){
            if(myString.charAt(i)!='a'&&myString.charAt(i)!='e'&&myString.charAt(i)!='i'&&myString.charAt(i)!='o'&&myString.charAt(i)!='u'&&myString.charAt(i)!=' '){
                count ++;
                cons+=myString.charAt(i);
            }


        }
        System.out.print(count);
        System.out.print(cons);
    }
}