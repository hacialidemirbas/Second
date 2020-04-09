package JavaReview;

public class CapitalLetters {
    public static void main(String[] args) {
        findCapitalLetters("It is Time To Review");

    }
    public static  void findCapitalLetters(String arr){
        int counter=0;
        for(int i=0; i<arr.length();i++){
            if (arr.charAt(i)>64&&arr.charAt(i)<92){
                counter++;

            }
        }

        if(counter>4){
            System.out.println("Accept");
        }
        else{
            System.out.println("Rejected");
        }
        System.out.println("Total there are "+counter+" capital letters");
    }
    public static int countCapLet(String arr){
        int numOfCapLet=0;
        for(int i=0; i<arr.length();i++){
            if (arr.charAt(i)>64&&arr.charAt(i)<92){
                numOfCapLet++;

            }
        }
return numOfCapLet;

    }
}
