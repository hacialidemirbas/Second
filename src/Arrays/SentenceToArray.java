package Arrays;

public class SentenceToArray {
    public static void main(String[] args) {
        String sentence="We love java";
        String[]resultArray=convertStringToArray(sentence);
        for(String word:resultArray){
            System.out.println(word);
        }

    }
    public static int findNumbersOfWords(String sentence){
        int counter=0;
        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }
    public static String[]convertStringToArray(String sentence){
        int numWords=findNumbersOfWords(sentence);
        String[]result=new String [numWords];
        String word="";
        int index=0;
        for(int j=0;j<sentence.length();j++){
            word+=sentence.charAt(j);
            if(sentence.charAt(j)==' '){
                result[index]=word;
                index++;
                word="";
            }
        }return result;
    }



}

