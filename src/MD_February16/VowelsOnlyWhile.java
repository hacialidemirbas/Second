package MD_February16;

public class VowelsOnlyWhile {
    public static void main(String[] args) {
        String sentence = "Sunday is fun day";
        //System.out.println(sentence.length());
        int index=0;
        while(index<sentence.length()){
            //index=0;
            if(!(sentence.charAt(index)=='u' || sentence.charAt(index)=='a' || sentence.charAt(index)=='i')) {
                System.out.println(sentence.charAt(index));
            }
            index++;

        }

    }
}
