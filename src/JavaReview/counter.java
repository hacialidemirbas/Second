package JavaReview;

public class counter {
    public static void main(String[] args) {
        String sentence = "We are in love with Java";
         int counter=0;
         for(int i=0;i<sentence.length();i++){
             if(sentence.charAt(i)==' '){
                 counter++;
                 System.out.println(counter);
             }
         }
    }
}
