package JavaReview;

public class Sum {
    public int addition(int a, int b){
        return a+b;
            }
    public static int sum(int x, int y)
            {
                return x+y;
            }
    public static void main(String[] args) {
        Sum add= new Sum();
        System.out.println(add.addition(5, 7));
        System.out.println(Sum.sum(9,10));
    }
}
