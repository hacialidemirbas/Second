package Package8m;

public class totalNumberOfChars {
    public static void main(String[] args) {
        char[] sentence={'W','e',' ','l','o','v','e',' ','j','a','v','a'};
        numberOfChar(sentence);
        numberOfWords();
        countNumberOfLines(sentence);
    }
    public static void numberOfChar(char[]  fileArray){

        int counter=0;
        for(int i=0; i<fileArray.length;i++){
            if (fileArray[i]!=('\0')&& fileArray[i]!=('\1')){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void numberOfWords(){
        String sentence="We love java";
        int counter=1;
        for (int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                counter++;
            }
        }
        System.out.println(counter);

    }
    public static int countNumberOfLines(char[]  fileArray){
        int numberoflines=0;
        for(int i=0;i<fileArray.length;i++){
            if(fileArray[i]=='\1'){
                numberoflines++;
            }
        }
        return numberoflines;
    }
}
