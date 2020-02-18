package Package2;

public class formatex {
    public static void main(String[]args){
        String student1 ="John";
        String student2 ="Kimberly";
        System.out.format("Name \t\t Grade\n");
        System.out.format("----- \t\t -----\n");
        System.out.format("%s\t\t : \t\t A\n",student1);
        System.out.format("%s\t : \t\t A", student2);

    }
}
