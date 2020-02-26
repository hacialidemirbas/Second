package methodsandlibraries;

public class checkPalindrome {
    public static void checkPalin(String word){//madam
        String reversedWord = printBackward.reverseText(word);
        if(reversedWord.equals(word)){
                System.out.println("It is a palindrome");

            }
            else{
                System.out.println("It is not a palindrome");
            }
        }



     {
    }

    public static void main(String[] args) {
        checkPalin("madam");
        palindrome("racecar");
    }
    public static boolean palindrome(String word1){
        boolean result = true;
        int end=word1.length()-1;
        for(int i=0;i<word1.length();i++){
            if(word1.charAt(i)!=word1.charAt(end)){
                result=false;
            }
            end--;
        }

        return result;
    }

}
