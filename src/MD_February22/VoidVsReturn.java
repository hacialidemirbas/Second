package MD_February22;

public class VoidVsReturn {
    public static void methodA(){
        int a;
        int b=40;
        a=b;
    }

    public static int methodB(){
        int a;
        int b=40;
        a=b;
        return a;
    }

    public static void main(String[] args) {
        methodA();
        int a=methodB();
    }
}
