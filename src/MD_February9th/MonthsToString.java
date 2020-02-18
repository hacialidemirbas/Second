package MD_February9th;
import java.util.Scanner;
public class MonthsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter month number : ");
        int month = scanner.nextInt();
        String monthText="x";
        switch (month){
            case 1:
                //System.out.println();
                monthText="January";
                break;
            case 2:
                monthText="February";
                break;
            case 3 :
                monthText="March";
                break;
            case 4:
                monthText="April";
                break;
            case 5:
                monthText="May";
                break;
            case 6:
                monthText="June";
                break;
            case 7:
                monthText="July";
                break;
            case 8:
                monthText="August";
                break;
            case 9:
                monthText="September";
                break;
            case 10:
                monthText="October";
                break;
            case 11:
                monthText="November";
                break;
            case 12:
                monthText="December";
                break;
            default:
                System.out.println("Only 1-12");
                break;
        }
        if(!monthText.equals("x"))
        System.out.println(monthText);
    }
}
