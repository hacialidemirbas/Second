package polymorphism;

public class AttendanceTest {
    public static void main(String[] args) {
        String [] studentList={"Ali","Veli","Hasan","Huseyin","Ayse","Fatma"};
        int[] studentIDList={1,2,3,4,5,6};
        String [] daysOfWeek={"Mon","Tue","Wen","Thu","Fri"};
        Attendance myAtt= new Attendance (studentList,studentIDList);
        myAtt.enterAttendanceToday("tue");
        myAtt.enterAttendanceToday("mon");
        myAtt.printWeeklyAttendance();
        myAtt.findTheMostAttended();
        myAtt.findTheMostAttendedDay();
        myAtt.printDailyAttendance("mon");

    }
}
