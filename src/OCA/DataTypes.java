package OCA;

public class DataTypes {
    public static void main(String[] args) {
        //int i=100;
       // int i=200;
        //byte b=(byte)i;
        //System.out.println(b);
        short s1=10;
        short s2=20;
        //int result = s1 + s2; byte, short, and int result will automatically int; float and double (book page 56)
        short result= (short)(s1+s2);
        System.out.println(result);

        float f1=2.1f;
        float f2=3.2f;
        float result2 = f1 + f2;
        System.out.println(result2);
        int i=2;
        float f3=3.5f;
        float result3=i+f3;
        System.out.println(result3);
        byte b1=5;
        byte b2=10;
        int result4 = b1 + b2; //int long double anything bigger than int
        System.out.println(result4);
        long l1=100;
        long l2=200;
        long result5 = l1 + l2;//long float double works
        System.out.println(result5);
        long x=10;
        int y= (int) (2*x);

        short x1=10;
        int y1= 2*x1;

        long x2=10;
        long y2=2*x2;

        double d1=10;
        double d2=2*d1;

        byte ba=40, bc=50;
        byte sum= (byte) (ba+bc);



    }

}
