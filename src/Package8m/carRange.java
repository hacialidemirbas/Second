package Package8m;

public class carRange {
    public static void main(String[] args) {
        mileRange(30,15);
        mileRangeDouble(33.33,14.5);

    }
    public static void mileRange(int MPG,int tank){
        int range=MPG*tank;
        System.out.println(range);
    }
    public static void mileRangeDouble(double MPG,double tank){
        double range=MPG*tank;
        System.out.println((int)(range));}
}
