package Exceptions;

public class Multiple {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of boundry exception");
        }
        catch(Exception e){
            System.out.println("Parent exception");
        }
    }
}
