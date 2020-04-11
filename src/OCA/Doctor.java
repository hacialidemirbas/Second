package OCA;

public class Doctor extends Person{
    public String name;
    public Doctor(String  name){
        this.name=name;

    }
    public Doctor (String firstName, String lastName){
        this.name=firstName+lastName;
    }
    public void doSurgery(){
        System.out.println("Doctor does surgery");
    }
    public void speak(){
        System.out.println("Doctor speaks");
    }
    public static void doSurgery1(){
        System.out.println("Doctors do surgery");

    }
}
