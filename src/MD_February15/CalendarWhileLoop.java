package MD_February15;

public class CalendarWhileLoop {
    public static void main(String[] args) {
        int month=1;
        int day;
        while(month<=12){
            day=1;
            while(day<=30){
                System.out.println(month+"-"+day+"-"+"2020");
                day++;
            }
            month++;
        }
    }
}
