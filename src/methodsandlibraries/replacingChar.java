package methodsandlibraries;

public class replacingChar {
    public static void replaceChar(String text, char tobereplaced, char toreplace) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == tobereplaced) {
                System.out.print(toreplace);
            } else {
                System.out.print(text.charAt(i));
            }
        }


    }

    public static void main(String[] args) {
        replaceChar("I love Java", 'a', 'o');
        String newString=replaceCharStr("Hello", 'o', 'a');
        System.out.println("\n"+newString);
        removeCons("aaabbbccc");
    }
    public static String replaceCharStr(String text, char lookup, char newChar){
        String replaced="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==lookup){
                replaced+=newChar;
            }
            else{
                replaced+=text.charAt(i);
            }
        }
        return replaced;
    }
    public static void removeCons(String consecutive){
        consecutive+=" ";
        for(int i=0; i<consecutive.length()-1;i++){
            if(consecutive.charAt(i)!=consecutive.charAt(i+1)){
                System.out.print(consecutive.charAt(i));
            }

        }
    }
}
