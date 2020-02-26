package methodsandlibraries;

public class string {
    public static void topToBottom(String a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));


        }
    }

    public static void main(String[] args) {
        topToBottom("Hello");
    }
}
