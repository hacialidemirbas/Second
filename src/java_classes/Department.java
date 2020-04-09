package java_classes;

public class Department {
    protected String employeeName;
    protected int employeeID;
    protected String position;
    protected double salary;

    Department(String employeeName,int employeeID,String position,double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.position = position;
        this.salary = salary;
    }

    public Department() {
        this.employeeName="Temp";
        this.employeeID=999;
        this.position="intern";
        this.salary=1000;


    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    void ChangePosition(String newPosition){
        this.position= newPosition;
    }
    void changeSalary(double newSalary){
        this.salary+=newSalary;
    }

}
