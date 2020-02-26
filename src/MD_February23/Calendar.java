package MD_February23;

public class Calendar {

    public static void printCalendar(int year,String seperator){
        for(int i=1 ; i<13 ; i++){
            System.out.println("Month "+i);
            for(int j=1 ; j<31;j++){
                System.out.println(i+seperator+j+seperator+year);
            }
            System.out.println("---------");
        }
    }
}
