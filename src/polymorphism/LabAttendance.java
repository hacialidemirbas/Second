package polymorphism;

public class LabAttendance extends Attendance {
    private String[] labSubjects;
    private int[][] labGrades;
    public LabAttendance(String students[],int[] studentId,String labSubjects[]){
        super(students,studentId);
        this.labSubjects=labSubjects;
        int[][] grades = new int[this.labSubjects.length][super.getStudents().length];
        this.labGrades=grades;
    }
    public String[] getLabSubjects(){
        return this.labSubjects;
    }
    private int findIndex(String subject){
        int index=0;
        for (int i = 0; i <this.labSubjects.length ; i++) {
            if (this.labSubjects[i].equalsIgnoreCase(subject)){
                index=i;
            }
        }
        return index;
    }
    public void enterGrades(String subject,int[] grade){
        int index=this.findIndex(subject);
        this.labGrades[index]=grade;
    }
    public void printAllGrades(){
        System.out.print("\t\t\t");
        for(String student:super.getStudents()){
            System.out.format("%10s",student);
        }
        System.out.println();
        for (int i = 0; i < this.labSubjects.length ; i++) {
            System.out.format("%15s",this.labSubjects[i]);
            for (int j = 0; j <super.getStudents().length ; j++) {
                System.out.format("%7d",this.labGrades[i][j]);
            }
            System.out.println();
        }
    }
    public void printAttendanceGrades(){
        super.printWeeklyAttendance();
        this.printAllGrades();
    }
}