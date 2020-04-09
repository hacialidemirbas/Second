package OOPConcepts;

public class InheritanceExample {
    private static int additionPrivateStatic(int a, int b) {
        return a + b;
    }
    {
        additionPrivateStatic(4, 7); //private can be reached only in the same class
    }
    public static int additionPublicStatic(int a, int b){
        return a+b;
    }
    private  int additionPrivate(int a, int b){
        return a+b;
    }
    {
        this.additionPrivate(5, 10);
    }
    public int additionPublic(int a, int b){
        return a+b;
    }


}
