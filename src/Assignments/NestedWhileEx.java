package Assignments;

public class NestedWhileEx {
    public static void main(String[] args) {
        int oLoop = 1;
        while (oLoop<20) {

            while(oLoop < 11) {
                System.out.println(oLoop);
                oLoop++;
            }

            System.out.println(oLoop);
            oLoop++;
    }

    }
}
