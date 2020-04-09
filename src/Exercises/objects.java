package Exercises;

    public class objects {
    String firstName;
    void setFirstName(String newValue) {
        firstName = newValue;
    }


    public static void main(String[] args) {
        String s="123456789";
        String sub= s.substring(4,8);
        System.out.println(sub);
        char a= s.charAt(1);
        System.out.println(a);
        objects p = new objects();
        p.setFirstName("Jason");
        System.out.println( "firstName: " + p.firstName );
    }
    }

