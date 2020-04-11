package OCA;

public class MainClass {
    public static void main(String[] args) {
        Doctor dr1 = new Doctor("DrNancy");
        Doctor.doSurgery1();
        dr1.name="Dr Oz";
      dr1.doSurgery();
        Doctor dr2 = new Doctor("DrOz");
//        dr2.doSurgery();
        Doctor dr3 = new Doctor("Joe","Adams");
        dr3.speak();
        System.out.println("handCount before change: " + dr3.handCount);
        dr3.handCount = 4;
        System.out.println("handCount after change: " + dr3.handCount);
        System.out.println(dr1.handCount);
        Person p1 = new Doctor("DrRobert");
        Object o1 = new Doctor("DrJennifer");
        Object o2 = new String("text");

        p1.speak();
        dr3.speak();

    }
}
