package OCA.TestProject;

import OCA.TestProject.Models.Doctor;
import OCA.TestProject.Models.Person;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Person joe= new Person("joe");
        Person diana = new Doctor("diana","pediatrician");
        Doctor ana= new Doctor("ana", "eye");
        joe.speak();
        diana.speak();
        ana.speak();
        ana.speak("ana");
        System.out.println(ana);
        ArrayList<Person>personList=new ArrayList<>();
        Person p1= new Person("adam");
        Person p2= new Person("john");
        Person p3= new Person("jennifer");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        Person pRandom= new Person("john");
        boolean isRandomPersonExistInPersonList=personList.contains(pRandom);
        System.out.println(isRandomPersonExistInPersonList);
    }

}
