package creating_classes;

public class interviewTest {
    public static void main(String[] args) {
        interview candidate1=new interview("Sami",100,100,100);
        System.out.println(candidate1.toString());
        System.out.println(candidate1.decideResult());
        candidate1.calculateScore();
        System.out.println(candidate1.decideResult());

    }


}
