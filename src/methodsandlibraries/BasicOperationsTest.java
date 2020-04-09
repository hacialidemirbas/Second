package methodsandlibraries;

public class BasicOperationsTest {
    public static void main(String[] args) {
        //int result= BasicOperations.subsTwo(BasicOperations.addTwo(int a, int b, result:));
        int result=BasicOperations.subsTwo(6, 7)+(BasicOperations.addTwo(6, 7));
       System.out.println(result);
        BasicOperations.addTwo(3,5);
    }
}
