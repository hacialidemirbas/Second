package Assignments;

public class WhileNestedLoop {
    public static void main(String[] args) {
        int x=0;
        while(x<3){
            x++;
            while(x<3){
                System.out.println("Java");
            }
        }
    }
}
