package creating_classes;

public class Employee {
    //Attribute Decleration
    int empID;
    String empName;
    String empDept;
    double empSal;
    String empCTyp;
    //Constructor with parameter
    public Employee(int EmpID, String EmpName, String EmpDep, double EmpSal, String EmpContrctType){
        empID=EmpID;
        empName=EmpName;
        empDept=EmpDep;
        empSal=EmpSal;
        empCTyp=EmpContrctType;
    }
    //constructor without parameter
    public Employee(){
this.empID=12345;
this.empName="Gundi";
this.empDept="Sales";
this.empSal=50000.00;
this.empCTyp="Full Time";

    }
    public double calculateWeeklyPayment(){
        double weekly= this.empSal/52;
        return weekly;
    }
    public double calculateBiWeeklyPayment(){
        double biWeekly=this.empSal/26;
        return biWeekly;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSal=" + empSal +
                ", empCTyp='" + empCTyp + '\'' +
                '}';
    }


}
