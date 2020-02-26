package MD_February16;

public class CapitalLettersOnly {
    public static void main(String[] args) {
        String sentence = "BootCamp Attendees Rocks";
        char letter;

        for(int i=0 ; i<sentence.length() ; i++){

            letter=sentence.charAt(i);

            if(letter>=65 && letter<=90){

                System.out.println(sentence.charAt(i));


            }

        }
    }
}
