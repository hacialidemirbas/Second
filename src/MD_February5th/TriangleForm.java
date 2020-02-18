package MD_February5th;

public class TriangleForm {
    public static void main(String[] args) {
        int A=100;
        int B=15;
        int C=20;
        if( (A+B>C) && (A+C>B) && (B+C>A) ){
            System.out.println("Can form Triangle");
        }
        else {
            System.out.println("Can not form Triangle");
        }
    }
}
