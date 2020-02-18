package Package2;

public class Receipt {
    public static void main (String[] args){
        System.out.println("Receipts:");
        float item1 = 1.99f;
        float item2 = 2.49f;
        System.out.format("\t\t\t\tReceipt\n");
        System.out.format("\t\t\t\t--------------------------------------------------------\n");
        System.out.format("\t \t Item1 \t: \t $%.2f\n",item1);
        System.out.format("\t \t Item2 \t: \t $%.2f",item2);

    }

}
