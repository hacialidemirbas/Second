package Exercises;

public class Strings {


    public static void main(String[] args) {
        String str=new String ("hello world     ");
        String str1= str.toUpperCase();
        String str2=str.substring(2, 8);
        System.out.println(str1);
        System.out.println(str2);
        str2+="RLD";
        System.out.println(str2);
    }
}
