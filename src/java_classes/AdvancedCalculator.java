package java_classes;

public class AdvancedCalculator extends Calculator {
    protected String screenColor;
    public AdvancedCalculator(){
        super();
        this.screenColor="blue";
    }
    public AdvancedCalculator(String color){
        super();
        this.screenColor=color;
    }
    double average( int a, int b){
        double average =(a+b)/2;
        return average;
    }
    int factorial(int a){
        int factorial=1;
        for(int i=a; i>0;i--){
            factorial*=i;
        }
        return factorial;
    }
    double squareRoot (int a){
        return Math.sqrt(a);

    }
    int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
