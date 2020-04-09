package review_second;

public class ExpoPlannerTest {
    public static void main(String[] args) {
        ExpoPlanner expo1= new ExpoPlanner();
        expo1.listAll();
        expo1.addEvent("june 30th", "Selenium");
        String[]checkList={"A","B","C","D","E"};
        expo1.modifyCheckList("june 30th",checkList);
        expo1.listAll();
    }
}
