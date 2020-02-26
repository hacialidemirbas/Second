package MD_February22;

public class FirstMethod {
    public static void printSome(){
        int x=0;
        do {
            System.out.println("Hello World");
            x++;
        }
        while(x<10);
    }
    public static void printNumbers(){
        for(int i=1 ; i<=100 ; i++){
            System.out.println(i);
        }

}

    public static void main(String[] args) {
        FirstMethod.printNumbers();
        printSome();
        printNumbers();
        printNumbers();
        printNumbers();
    }
}
