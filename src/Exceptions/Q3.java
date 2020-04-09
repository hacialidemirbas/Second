package Exceptions;

public class Q3 {
    public static void main(String[] args) {
       newLetter("I love java");
       newLetter("null");
       newLetter("abcd");

    }
    public static void newLetter(String a){
       // String str = "i love java";
        int leng = 0;
        for (int i = 0; i < a.length(); i++) {
            leng++;
        }
        //System.out.println(leng);
        char lastletter = a.charAt(leng-1);
       // System.out.println(lastletter);
        int add1=lastletter+1;
        char add= (char) add1;
       // System.out.println(add);
        String addedstr=a+add;
       // System.out.println(addedstr);
       // System.out.println(add1);
        for (int i = 1; i < a.length()+1; i++) {
            System.out.print(addedstr.charAt(i ));

        }
        System.out.println();
    }
}
