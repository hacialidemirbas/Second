package StaticMethods;

public class Counter {
    private static int count=5;
    public Counter(){
        count++;
    }

    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();
        System.out.println(count);

    }
}
