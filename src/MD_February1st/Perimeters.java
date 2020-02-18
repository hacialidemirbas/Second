package MD_February1st;

public class Perimeters {
    public static void main(String[] args){
        double radius = 3.67;
        final double PI_NUMBER = 3.14;
        System.out.println("Perimeter is :" + 2*radius*PI_NUMBER);
        /* Difference between concat. and addit.
        int a = 10;
        String b = "10";
        int c = 10;
        System.out.println(a+b);
        System.out.println(a+c);
        */
        int length = 20;
        int width = 10;
        System.out.println("Perimeter for rectangle : " + 2*(width+length));

        int edge1 = 10;
        int edge2 = 15;
        int edge3 = 18;
        System.out.println("perimeter : " + (edge1+edge2+edge3));
        int a = 10;
        String b = "10";
        int c = 10;
        System.out.println(a+b);
        System.out.println(a+c);

    }
}
