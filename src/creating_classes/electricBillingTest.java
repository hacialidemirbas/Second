package creating_classes;

public class electricBillingTest {
    public static void main(String[] args) {
        electricBilling myBill= new electricBilling(123456789, 0, "Jack", 0);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
    }
}
