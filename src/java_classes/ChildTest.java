package java_classes;

public class ChildTest {
    public static void main(String[] args) {
        Child myChild= new Child(10, 20);
        System.out.println(myChild.getX());
        myChild.setX(30);
        System.out.println(myChild.getX());
    }

}
