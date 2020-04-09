package java_classes;

public class Calculator {
    protected int display;
    public Calculator(){
        this.display=0;
        System.out.println("Display value : "+display);
    }
    protected int add( int a, int b){
        return a+b;
    }
    public int subst(int a, int b){
        return a-b;
    }
    private int divide (int a, int b){
        return a/b;
    }
    int multip(int a, int b){
        return a*b;
    }

}
