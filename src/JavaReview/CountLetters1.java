package JavaReview;

public class CountLetters1 {
    public static void main(String[] args) {
        int count=0;
        String sen="Java is fun";
        for(int i=0;i<sen.length();i++){
            char letter=sen.charAt(i);
            boolean check=letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u';
            if(check){
                count++;
            }

        }
        System.out.println(count);
    }
}
