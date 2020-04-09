package JavaReview;

public class Student {
    private String name;
    private Student(String n){
        this.name=n;
            }
    public Student(){
        name="unknown";
    }

    public void getName() {
        System.out.println( name);
    }

    public static void main(String[] args) {
        Student std1= new Student("Nil");
        Student std2 = new Student();
        std1.getName();
        std2.getName();
    }
}
