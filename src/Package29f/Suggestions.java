package Package29f;

public class Suggestions {
    public static void number(){
        int number= (int) (Math.random()*3)+1;
if (number==1){
    System.out.println("Drink soup");
}
else if (number==2){
    System.out.println("Eat Hamburger");
}
else{
    System.out.println("Enjoy salad");
}
    }

    public static void main(String[] args) {
     number();
     randomCloth();
    }
    public static void randomCloth(){
        int decision = (int) (Math.random()*3)+1;
        if ( decision==1){
            System.out.println("Red shirt");

        }
        else if(decision==2){
            System.out.println("Blue jeans");
        }
        else {
            System.out.println("White hat");
        }
    }
}
