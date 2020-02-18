package Package16F;

public class AllLowerCasesLoop {
    public static void main(String[] args) {
        String mySentence="Unfortunately, I Have Forgotten to Push my Codes to GitHub";

        for (int i=0; i<mySentence.length();i++){

            if((mySentence.charAt(i)>=97 && mySentence.charAt(i)<=122)||mySentence.charAt(i)==' '){
                System.out.print(mySentence.charAt(i));
            }
            else{
                System.out.print("  -  ");
            }
        }
    }
}
