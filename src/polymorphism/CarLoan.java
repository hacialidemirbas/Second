package polymorphism;

public class CarLoan extends Loan {
    double APR;
    int creditScore;

    public CarLoan(int accountNum, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount, double APR, int creditScore) {
        super(accountNum, accountName, balance, interestRate, numOfPayment, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;
    }
    double calculateMonthly (){
        double monthly=(super.loanAmount*this.APR/super.numOfPayment)-(this.creditScore/10);
        return monthly;
    }
    public double calculateMonthlyPayment (){
        double totalAmount=super.loanAmount*super.interestRate;
                return totalAmount;
    }
}
