package Package16F;

public class AllCapitalLettersString {
    public static void main(String[] args) {
        String mySentence="BootCamp Attendees Rocks";
        char letter;
        for (int i=0; i<mySentence.length();i++){
           letter=mySentence.charAt(i);
           if(letter>=65 && letter<=90){
               System.out.println(mySentence.charAt(i));
           }
        }

    }
}
