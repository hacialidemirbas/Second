package Exceptions;

public class Multiple4 {
    public static void main(String[] args) {
        int arr[]= new int[5];
        try{
            arr[5]=40/0;
        }
       // catch (Exception e){
         //   System.out.println("Exception handled");}
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        System.out.println("Rest of the codes");
    }
}
