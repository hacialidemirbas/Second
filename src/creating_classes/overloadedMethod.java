package creating_classes;

public class overloadedMethod {
    public static void main(String[] args) {
        ovLoaded();
        ovLoaded("Java ");
        ovLoaded("I love Java",50);

    }

    public static void ovLoaded() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world");
        }
    }
    public static void ovLoaded(String word){
        for (int i = 0; i < 100 ; i++) {
            System.out.println(word);

    }}
    public static void ovLoaded(String word, int number){
            for (int i = 0; i < number ; i++) {
                System.out.println(word);
            }
    }
}