package Package8m;

public class reviewMethods {
    public static void main(String[] args) {
        addTwoVoid(50,60);
      addTwoReturn(50,60);
      addTwoDoubleVoid(50,60);
      addTwoDoubleReturn(50,60);
      addTwoCharVoid('a','b');
        addTwoCharVoid('5','6');
        addTwoCharReturn();
        addTwoString("apple","pear");

    }
    public static void addTwoVoid(int a, int b){
        System.out.println(a+b);
    }
    static int addTwoReturn(int a, int b){
       return a+b;
    }
    public static void addTwoDoubleVoid(double c, double d){
        System.out.println(c+d);
    }
    public static double addTwoDoubleReturn(double c, double d){
        return c+d;
         }
    public static void addTwoCharVoid(char a, char b){
             System.out.println( a+ b);
         }
public static char addTwoCharReturn(){
        return 'a'+'b';
}
public static void addTwoString(String a, String b){
    System.out.println(a+b);
}

}
