package Exceptions;

public class ThirdEx {
    public static void main(String[] args) {
        try{
           int a[]=new int[5];
            a[5]=30/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
        catch(Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Rest of the code");
        try{
            int a[]=new int[5];
            a[10]=10;
            a[5]=5/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
        catch(Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Rest of the code");
    }
}
