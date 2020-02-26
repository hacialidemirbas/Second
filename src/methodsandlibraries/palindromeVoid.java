package methodsandlibraries;

public class palindromeVoid {
    public static void  PalindromeCheck(String text){
        String reversed="";
        for(int i=text.length()-1;i>=0;i--){
            reversed+=text.charAt(i);
        }
        if (reversed.equals(text)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");

        }

    }

    public static void main(String[] args) {
        PalindromeCheck("papa");
        String a="def";

    }
}
