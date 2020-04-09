package Arrays;
//random string array
public class array2DimensionalString {
    public static void main(String[] args) {
        String [][] arrayWords=new String [4][7];
        for(int i=0; i< arrayWords.length;i++){
            for(int j=0;j<arrayWords[i].length;j++){
                arrayWords[i][j]=randomString.createRandomString();
            }
        }
        for(String words[]:arrayWords){
            for(String word:words){
                System.out.format("\t%10s",word);
            }
            System.out.println();


        }}}
