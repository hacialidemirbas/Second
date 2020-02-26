package methodsandlibraries;

public class pyramid {
    public static void pyramids(){
        for(int i=1;i<5;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void addNumberPyramids (int numberOfLines) {
        for (int i=1; i<numberOfLines;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        pyramids();
        addNumberPyramids(10);
    }
}
