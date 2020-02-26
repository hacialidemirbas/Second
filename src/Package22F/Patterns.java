package Package22F;

public class Patterns {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++)
        {for (int k=19;k>=i;k--){
            System.out.print("  ");}

            for (int j=1; j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int t=0;t<=20;t++){
            for (int space=0;space<=t;space++){
                System.out.print("  ");
            }
            for(int j=20; j>=t;j--){
            System.out.print(j);
            }
            System.out.println();

        }

    }
}
