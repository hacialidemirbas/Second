package OCA.TestProject.Models;

public class Doctor extends Person{
    public Doctor(String name, String specialty) {
        super(name);
        this.specialty=specialty;
    }

    private String specialty;
    public String getSpecialty(){
        return this.specialty;
    }

    @Override
    public void speak() {
        System.out.println("Doctor speaking");
    }
    //overloading
    public void speak(String name) {
        System.out.println(name+"   Doctor speaking");
    }
    public String toString()

{
    return "Hello, I am a doctor "+getName();
}}
