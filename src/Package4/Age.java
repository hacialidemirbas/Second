package Package4;

public class Age {
    public static void main(String[] args) {
        int age=20;
        if(age<0){
            System.out.println("Can not be negative");
        }
        else if (age>120){
            System.out.println("Can not be bigger than 120");
        }
        else {
            System.out.println("It is OK");
        }

    }
}
