package Exercises;

public class PalindromeMeMyself {
    public static void main(String[] args) {
        String palin="Madam";
        String ters="";
        for(int i=palin.length()-1;i>=0;i--){
            ters+=palin.charAt(i);
        }
        if(ters.equalsIgnoreCase(palin)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}
