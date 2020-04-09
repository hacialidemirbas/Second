package polymorphism;

public class StaticVarTest {
    public static void main(String[] args) {
        StaticVar obj1= new StaticVar();
        System.out.println("b=  "+obj1.b);
        System.out.println("a= "+obj1.a);
        StaticVar obj2= new StaticVar();
        System.out.println("b=  "+obj2.b);
        System.out.println("a= "+obj2.a);
        StaticVar obj3= new StaticVar();
        System.out.println("b=  "+obj3.b);
        System.out.println("a= "+obj3.a);
        StaticVar.getA();
        obj1.getB();
        StaticVar.getA();
        obj2.getB();




    }
}
