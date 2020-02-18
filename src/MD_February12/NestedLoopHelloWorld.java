package MD_February12;

public class NestedLoopHelloWorld {
    public static void main(String[] args) {
        for(int i=0 ; i<1 ; i++){
            System.out.print("Hello ");
            for(int j=11 ; j<14 ; j++){
                System.out.print("world ");
            }
        }
        System.out.println();
        for(int i=1 ; i<=1 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print("Hello ");
            }
            System.out.println("World");
        }
    }
}
