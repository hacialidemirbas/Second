package Arrays;

public class randomString {
    public static String  createRandomString( ){
        String word="";
        int wordLength=(int)(Math.random()*6+1);
        for(int i=0; i<wordLength;i++){
            word+=(char)((int)(Math.random()*26+(65)));

        }
        return word;

    }

    public static void main(String[] args) {
       // System.out.println(createRandomString());
        String[] arrayString= new String[20];
        for(int i=0; i<arrayString.length;i++){
            arrayString[i]=createRandomString();
        }
        for(String word:arrayString){
            System.out.print(word+" ");
        }
    }
}
