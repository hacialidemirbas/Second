package review_second;

public class PlannerTest {
    public static void main(String[] args) {
        Planner planner= new Planner();
        planner.addEvent("April 10", "Java String");
        planner.addEvent("May 15", "Java");
        planner.deleteEvent("May 15");
        planner.addEvent("May 15", "Java");
        planner.addEvent("May 15", "Java");
        planner.addEvent("May 15", "Java");
        planner.addEvent("May 15", "Java");



    }
}
