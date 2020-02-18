package Package15F;

public class CalendarMixed {
    public static void main(String[] args) {
        //while and for
        int month=1;
        while(month<13){
            for (int day=1; day<31; day++){
                System.out.println(day+"/"+month+"/"+"2020");

            }
            month++;
        }
        //for and while
        int d;
        for(int m=1; m<13;m++){
            d=1;
            while(d<31){
                System.out.println(d+"/"+m+"/"+"2020");
                d++;
            }
        }
    }
}
