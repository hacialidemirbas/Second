package polymorphism;

public class TestB3 {
    public static void main(String[] args) {
        A3  myA3= new A3();
        A3 myAB= new B3();
        B3 myB3= new B3();
        myA3.method1();
        myAB.method1();
        myB3.method1();


    }
}
