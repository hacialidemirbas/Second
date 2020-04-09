package Exercises;

public class PassByExperiment {
    private int year;

    public PassByExperiment(int i, int i1, int i2) {
    }

    public static void main(String[] args) {
PassByExperiment date=new PassByExperiment(1,20,2020);
        System.out.println("Before passing an object "+date);
        passObject(date);
        System.out.println("After passing an object  "+date);

    }
public static void passObject(PassByExperiment d){
d.year=2009;
}
public static void passPrimative(int i){
i=2010;
}
public static void passString(String s){
        int yearSlash=s.lastIndexOf('/');
        s=s.substring(0, yearSlash+1);
        s+="2012";
    System.out.println("New date string: "+s);
}
}
