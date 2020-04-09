package JavaReview;

public class Company {
    String name;
    public Company(){
        name="Dell computers";
    }
    public Company(String name){
        this.name=name;
    }
    public void get(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Company obj= new Company();
        Company obj1 = new Company ("HP");
        System.out.println(obj.name);
        System.out.println(obj1.name);
        obj.get();
        obj1.get();
    }
}
