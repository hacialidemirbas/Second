package Exercises;

public class ex2m {
    public static void main(String[] args) {
        Object[] stringArray = new String[5];   //No compile time error : String[] is auto-upcasted to Object[]

        stringArray[1] = "JAVA";

        //stringArray[2] = 100;
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5

        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14
    }

}
