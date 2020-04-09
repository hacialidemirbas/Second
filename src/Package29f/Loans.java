package Package29f;

public class Loans {
    public static double Mortgage(int monthlyPay, int numberPay){
        int totalAmount =35000;
        int restPayment=totalAmount-(monthlyPay*numberPay);
        return restPayment;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage(500,36 ));
        System.out.println(insurance(24000,36));
    }
    public static double insurance(int totalCarPrice, int numberOfPayment){
        double insurancePayment;
        int monthly=230;
         insurancePayment= (totalCarPrice/numberOfPayment)*0.9-(numberOfPayment);
         return insurancePayment;
    }


}
