package methodsandlibraries;

public class f26_RandemChar {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            int one=97+ (int) (Math.random()*26);//we are multiplaying by 26 because random number
            System.out.print((char)one);// will be smallest 0.000 or .9999
            System.out.println();
            generateLetterPass(6);
            generateLetterPass(6);
            passwordMix();
            System.out.println();
            abc123();
            System.out.println();
            int count=0;
            do{//to get multiple password
                abc123();
                System.out.println();
                count++;
                 }
            while (count<5);
        }
    }
    public static void generateLetPass(int PassLenght){
        for(int i=0;i<PassLenght;i++){
            System.out.print((char)(97+(int)(Math.random()*26)));
        }
    }
    public static String generateLetterPass(int passLen){
        String result="";
        for(int i=0;i<passLen;i++){
            result=result+(char)(97+(int)(Math.random()*26));
        }
        return result;
    }
    public static void passwordMix() {//first 3 letter and last 3 numbers ex: bsa726
        for (int i = 0; i < 3; i++) {
            int r = 97 + (int) (Math.random() * 26);
            System.out.print((char) r);
        }
        for(int j =0; j< 3;j++){
            System.out.print((int) (Math.random() * 10));
        }

    }
    public static void abc123(){
        for(int i=0;i<3;i++){//to generate random 3 letters
            System.out.print((char)(int)(Math.random()*26+97));
                    }
        for(int i=0;i<3;i++){
            System.out.print((int)(Math.random()*10));
        }

    }
}
