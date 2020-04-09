package creating_classes;

public class ExampleEncapsulationTest {
    public static void main(String[] args) {
        ExampleEncapsulation myTest= new ExampleEncapsulation(10, 3333);
        System.out.println(myTest.getId());
        myTest.setId(40);
        System.out.println(myTest.getId());
    }
}
