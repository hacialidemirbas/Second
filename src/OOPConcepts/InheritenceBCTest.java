package OOPConcepts;

public class InheritenceBCTest {
    public static void main(String[] args) {
        Inheritance obj1= new Inheritance(10);
        System.out.println(obj1.getA());
        InheritanceB obj2= new InheritanceB(2);
        System.out.println(obj2.getA());
        InheritanceC obj3= new InheritanceC(5);
        System.out.println(obj3.getA());
        obj3.setA(40);
        System.out.println(obj1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());


    }
}
