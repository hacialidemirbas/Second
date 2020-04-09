package Package8m;

import org.w3c.dom.ls.LSOutput;

public class removeSpaces {
    public static void main(String[] args) {
           removeSpaceVoid("it is a perfect day to study java");
           replaceSpaceVoid("it is a perfect day to study java");

    }
    public static void removeSpaceVoid(String sentence){
        for(int i=0; i<sentence.length();i++)   {
            if(sentence.charAt(i)!=' '){
                System.out.print(sentence.charAt(i));
            }
    }
        System.out.println();}

    public static void replaceSpaceVoid(String sentence){
        for(int i=0; i<sentence.length();i++) {
            if (sentence.charAt(i) != ' ') {
                System.out.print(sentence.charAt(i));
            }
            else{
                System.out.print("-");
            }
        }}}