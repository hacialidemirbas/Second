package polymorphism;

public class StaticVar {
    static int a=0;
    int b=0;
    public StaticVar(){
        this.a++;
        this.b++;
    }
    public static void getA(){
        System.out.println(a);
    }
    public void getB(){
        System.out.println(this.b);
    }
}
