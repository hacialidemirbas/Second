package MD_February15;

public class CalendarForLoop {
    public static void main(String[] args) {
        for(int month=1 ; month < 13 ; month++){
            System.out.println("MOUNT : "+month+"\n ____________");
            for(int day=1 ; day <= 30 ; day++){
                System.out.println(month+"/"+day+"/"+"2020");

            }

            if(month!=12) {
                System.out.println("---------");
            }
        }
    }


}
