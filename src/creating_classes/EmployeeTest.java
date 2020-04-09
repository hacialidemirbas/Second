package creating_classes;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee Gundi = new Employee(12345, "Gundi", "QA", 50000.0, "Full" +
                "Time");
        System.out.println(Gundi.calculateWeeklyPayment());
        System.out.println(Gundi.calculateBiWeeklyPayment());
        System.out.println(Gundi.toString());
        Employee Mutzhik= new Employee(12346, "Mutzhik", "QA", 60000, "Full" +
                "Time");
        System.out.println(Mutzhik.toString());




    }

}
