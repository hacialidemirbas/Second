package Package15F;
public class CalendarForLoop {
    public static void main(String[] args) {
        for(int y=2019;y<=2020;y++){

        for (int m = 1; m < 13; m++) {
            for (int d = 1; d <= 30; d++) {
                System.out.println(d+"/"+m+"/"+y);
            }
            System.out.println("------------");
        }
    }}}