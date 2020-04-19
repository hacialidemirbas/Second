package OCA.TestProject.Models;

import java.util.Objects;

public class Person {
    private String name;
    public Person(String name){
        this.name=name;

    }
    public String getName(){
        return this.name;
    }
    public void speak(){
        System.out.println("Person speaking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

