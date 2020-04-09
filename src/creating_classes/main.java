package creating_classes;

public class main {
    public static void main(String[] args) {
        System.out.println("Java is fun(from main)");
        main.main("it is fun");
    }
    public static void main(String arg1){
        System.out.println("Yes,"+arg1);
        main.main("it is fun","indeed");
    }
    public static void main(String arg1, String arg2){
        System.out.println("Right,"+arg1+arg2);
    }
}
