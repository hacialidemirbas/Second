package Package7m;

public class iterationLoopStructure2 {
    public static void main(String[] args) {
        String sentence="Java is my sweetheart";
        int counter=0;
        for(int i=0; i<sentence.length();i++){
            if((sentence.charAt(i)=='a')||(sentence.charAt(i)=='e')||(sentence.charAt(i)=='i')||(sentence.charAt(i)=='o')||(sentence.charAt(i)=='u')){
              counter++;
            }

        }
        System.out.println(counter);
    }
}
