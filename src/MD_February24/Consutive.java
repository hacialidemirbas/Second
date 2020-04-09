package MD_February24;

public class Consutive {
    public static void removeConsec(String text){
        text +=" ";
        for(int i=0 ; i<text.length()-1 ; i++){

            if(text.charAt(i)!=text.charAt(i+1)){

                System.out.print(text.charAt(i));
            }
        }
    }
}
