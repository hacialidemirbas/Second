package JavaReview;

public class CountLetters {
    public static void main(String[] args) {
        int count=0;
        String sen="Java is my sweetheart";
        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'
            ||sen.charAt(i)=='o'||sen.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println(count);
    }
}
