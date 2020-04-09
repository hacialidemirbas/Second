package Exercises;

public class Person {
    private String name;
    private String surname;
    private String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(){
        this("Jane","Nicole","abcd");
    }
}
