package methodsandlibraries;

public class printOddNumbers {
    public static void printOddNumbers(int start, int end){
        for ( int i = start; i<=end; i++){
            if(i % 2 == 1){
                System.out.println(i);

            }
        }
    }

    public static void printEvenNumbers(int start, int end) {
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
