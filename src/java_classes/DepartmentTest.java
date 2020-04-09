package java_classes;

public class DepartmentTest {
    public static void main(String[] args) {
        Department myEmp= new Department("Nilfilsa", 12345, "QA", 100000.00);
        System.out.println(myEmp.toString());
        ItDepartment myIt= new ItDepartment("Memo", 23456, "Testing", 120000.00, "Java");
        System.out.println(myIt.toString());
        myIt.addSkillSet("SQL");
        System.out.println(myIt.toString());
        AccountingDept myAcc=new AccountingDept("Veli", 34567, "QA", 80000.00, 2);
        System.out.println(myAcc.toString());




    }
}
