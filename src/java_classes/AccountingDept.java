package java_classes;

public class AccountingDept extends Department {
    private int yearsOfExperience;

    public AccountingDept(String employeeName, int employeeID, String position, double salary, int yearsOfExperience) {
        super(employeeName, employeeID, position, salary);
        this.yearsOfExperience = yearsOfExperience;
        }
    public void addYearsOfExperience(int years){
        this.yearsOfExperience+=years;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "AccountingDept{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
