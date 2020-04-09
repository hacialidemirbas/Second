package java_classes;

public class ItDepartment extends Department {

    private String skillSet;

    public ItDepartment(String employeeName, int employeeID, String position, double salary, String skillSet) {
        super();
        this.skillSet = skillSet;
        super.employeeName=employeeName;
        super.employeeID=employeeID;
        super.position=position;
        super.salary=salary;
    }
    public ItDepartment(){
        super();
        this.skillSet="Java";
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getSkillSet(){
        return this.skillSet;
    }
    public void addSkillSet(String newSkill){
        this.skillSet+=skillSet+" ";
    }

    @Override
    public String toString() {
        return "ItDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
