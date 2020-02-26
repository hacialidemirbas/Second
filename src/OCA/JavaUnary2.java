package OCA;

public class JavaUnary2 {
    public static void main(String[] args) {
        int x=10;
        x++;
        System.out.println(x);
        --x;
        System.out.println(x);
        int y=2+x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x);
        int y1=2+x++ + --x;
        System.out.println(y1);
        int c=7;
        int s=4;
         s+=++c;
        System.out.println(s);//12
        long thatNumber=5>=5? 1+2:1*1;
        if (++thatNumber<4)
            thatNumber+=1;
        System.out.println(thatNumber);//4

        int plan=4;
        plan=plan++ + --plan;
        //if (plan==1)
            System.out.println(plan);//page 50s


    }


}
