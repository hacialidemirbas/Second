package Exceptions;

public class Multiple2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception");
        }
        catch(Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Rest of the code");
    }
}
