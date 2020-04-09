package OOPConcepts;

public class InheritanceExampleTest {
    public static void main(String[] args) {
        InheritanceExample.additionPublicStatic(2, 5);//Static can be reached only with class name
        InheritanceExample ex1 = new InheritanceExample();// public can be reached by object creation
        ex1.additionPublic(3, 8);
    }
}
