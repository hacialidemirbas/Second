package PassingData;

public class ReturningValues {
    public static void main(String[] args) {
        int number=5;
        String letters="abc";
        //number(number);
        number=number(number);
        letters=letters(letters);
        System.out.println(number+letters);
    }
    public static int number(int number){
        number++;
        return number;
    }
    public static String letters(String letters){
        letters+="d";
        return letters;
    }
}
