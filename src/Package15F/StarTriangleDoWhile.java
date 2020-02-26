package Package15F;

public class StarTriangleDoWhile {
    public static void main(String[] args) {
        int i=1;
        int y;

        do{
            y=1;
            do{

                System.out.print("*  ");
                y++;

            }
            while(y<=i);
            System.out.println();
            i++;

        }
        while(i<16);
    }
}
