package polymorphism;

public class homeLoan extends Loan{
    double PMI;

    public homeLoan(int accountNum, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount, double PMI) {
        super(accountNum, accountName, balance, interestRate, numOfPayment, loanAmount);
        this.PMI = PMI;
    }
    public double calculateMonthly (){
        double monthly=(super.loanAmount*super.interestRate/super.numOfPayment)+this.PMI;
        return monthly;
    }
    public double calculateMonthlyPayment (){
        double totalAmount=super.loanAmount*super.interestRate+PMI*super.numOfPayment;
        return totalAmount;
    }
}
