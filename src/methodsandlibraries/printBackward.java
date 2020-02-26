package methodsandlibraries;

public class printBackward {
    public static void backward(String a){
        for (int i =a.length()-1; i >=0 ; i--){
            System.out.print(a.charAt(i));

        }
    }
    public static void reverseString(String sentence){
        for(int i=sentence.length()-1;i>=0;i--){
            System.out.print(sentence.charAt(i));
        }
    }
    public static String reverseText (String text) {
        String result = "";
        int i;
        for (i = text.length() - 1; i >= 0; i--) {
        result = result + text.charAt(i);

    }
    return result;
    }
}