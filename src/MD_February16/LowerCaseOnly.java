package MD_February16;

public class LowerCaseOnly {
    public static void main(String[] args) {
        String sentence = "I never Forget to push my Codes to GitHub";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        
        for(int i=0 ; i<sentence.length() ; i++){

            if( (sentence.charAt(i)>=97 && sentence.charAt(i)<=122) || sentence.charAt(i)==' ' ){

                System.out.print(sentence.charAt(i));
            }
            else{
                System.out.print("-");
            }
        }
    }
}
