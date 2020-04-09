package polymorphism;

public class LabAttendanceTest {
    public static void main(String[] args) {
        String students[]={"melih","shohrat","ismail"};
        int[] studentIds = {1,2,3};
        String labSubjects[]={"inheritance","polymorphism","interfaces"};
        LabAttendance myLab = new LabAttendance(students,studentIds,labSubjects);
        int[] grades={100,100,100};
        myLab.enterGrades("inheritance",grades);
        myLab.printAllGrades();
        myLab.printAttendanceGrades();
    }
}