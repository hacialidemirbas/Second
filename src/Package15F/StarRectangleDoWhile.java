package Package15F;

public class StarRectangleDoWhile {
    public static void main(String[] args) {
        int i=0;
        int j;
        do {
            j=0;
            do{
                System.out.print("*  ");
                j++;
            }
            while(j<5);
            System.out.println();
            i++;

        }
        while(i<10);
    }
}
