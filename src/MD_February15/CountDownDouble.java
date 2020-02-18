package MD_February15;

public class CountDownDouble {
    public static void main(String[] args) {
        double number=100;
        do{
            System.out.println(number);
            number -= 0.5;
        }
        while(number>=0);
    }
}
