package polymorphism;

public class TestBank {
    public static void main(String[] args) {
        Bank myBank= new Bank(12345, "nilfilsa", 1250);
        Loan myLoan=new Loan(23456,"new loan",4000,1.05, 20, 5000);
        Loan myCarLoan= new CarLoan(456789, "car", 3000.00, 1.04, 36, 7500, 3.45, 750);
        System.out.println(myCarLoan.calculateTotalPayment());
        Loan myHomeLoan= new homeLoan(98765, "home", 900000.00, 1.987, 360, 50000, 750);
        System.out.println(myCarLoan.calculateMonthlyPayment());
    }
}
