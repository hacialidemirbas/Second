package JavaReview;

public class Employee {
    String name;
    private Employee(String name){
        this.name=name;
        System.out.println(name+ " employee is added.");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Nil");
        Employee emp2 = new Employee("Fil");
        Employee emp3 = new Employee("Sa");

    }
}
