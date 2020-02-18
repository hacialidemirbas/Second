package Package16F;

public class HexNumbers {
    public static void main(String[] args) {

        String number="1241D343F";
        boolean hex= false;
        for (int i=0;i<9;i++) {
            if (number.charAt(i) == 'A' || number.charAt(i) == 'D'||number.charAt(i) == 'B'||number.charAt(i) == 'C'||number.charAt(i) == 'E'||number.charAt(i) == 'F') {
                hex=true;
                if (hex){
                    System.out.println("This is a HEX number");
                }
            }

            else{
                System.out.println("This is not a HEX number");
            }
        }}}
