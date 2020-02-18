package MD_February15;

public class CalendarMixed {
    public static void main(String[] args) {
        //while and for implementation
        int month=1;
        while(month<13){

            for(int day=1; day <=30 ; day++){
                System.out.println(month+"/"+day+"/"+"2020");
            }
            month++;
        }

        //for and while
        int dayWhile;
        for(int monthFor=1 ; monthFor<13 ; monthFor++){
            dayWhile=1;
            while(dayWhile<=30){
                System.out.println(monthFor+"-"+dayWhile+"-"+"2020");
                dayWhile++;
            }
        }
    }
}
