package Exceptions;

public class FirstEx {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try{
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            System.out.println("ooops division by zero exception");
            System.out.println(e);
        }
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch( Exception e){
            System.out.println("ooops");
        }
        String a="a";
        try{
            int number=Integer.parseInt(a);
        }
        catch( Exception e){
            System.out.println("Sorry I couldn't convert");
        }
        int numbers[]={1,2,3,4,5};
        try{
            System.out.println(numbers[77]);
        }

        catch (Exception e){
            System.out.println("Come on we do not have that index");
        }
        System.out.println("can you see me?");
        try{
            System.out.println(4/0);
            System.out.println("code");
        }
        catch (Exception e){
            System.out.println(e);
        }
        int i=50;
        int j=0;
        int data;
        try{
            data=i/j;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(i/(j+2));
        }
        try{
            int c=4/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
