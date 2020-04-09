package MD_February24;

public class CharRemoving {
    public static void removeChar(String text,char letter){
        for(int i=0; i<text.length();i++){
            if(text.charAt(i)!=letter){
                System.out.print(text.charAt(i));
            }
        }
    }
    public static String removeCharStr(String text,char letter){
        String removed="";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=letter){
                removed+=text.charAt(i);
            }
        }
        return removed;
    }
}
