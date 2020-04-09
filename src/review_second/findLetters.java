package review_second;

public class findLetters {
    public static void main(String[] args) {
        findCapitalLetters("Today is Review Day");
    }
    public static void findCapitalLetters(String sentence){
        int index=0;
        char capital=' ';
        for(int i=0;i<sentence.length();i++){


            if(sentence.charAt(i)>64&&sentence.charAt(i)<93){
                index++;
                capital=sentence.charAt(i);
                System.out.print(capital+" ");
            }
        }
        System.out.println();
        System.out.println(index);

    }
}
