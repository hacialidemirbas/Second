package OOPConcepts;

public class OperationsTest {
    public static void main(String[] args) {
        Operations parent= new Operations();
        parent.add(1, 2, 3);
        AdvancedOperations child= new AdvancedOperations();
        child.sumProduct(1, 2, 3);
        parent.multiply(2, 3);
        child.multiply(3, 5);
        child.add(6, 7);
        child.add(3, 6, 9);
        System.out.println(parent.a+" "+parent.b+" "+parent.c);
        Operations parent2= new Operations(55);
        System.out.println(parent2.a);
        System.out.println(parent2.b);
        System.out.println(parent2.c);


    }
}
