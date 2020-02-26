package Package19F;

public class TriangleWhileUpsideDown {
    public static void main(String[] args) {
        int a=1;
        int b;
        while(a<=10){
            b=10;
            while(b>=a)
            {
                System.out.print("*  ");
                b--;


            }
            System.out.println();
            a++;
        }
    }
}
