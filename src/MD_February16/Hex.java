package MD_February16;

public class Hex {
    public static void main(String[] args) {
        String number="1241D343F";
        boolean hex =false;
        for(int i=0 ; i<9 ; i++){
            if(number.charAt(i)=='D' || number.charAt(i)=='a'){
               hex=true;
            }
        }
        if(hex){
            System.out.println("HEXADECIMAL");
        }
        else {
            System.out.println("NOT HEXADECIMAL");
        }
    }
}
