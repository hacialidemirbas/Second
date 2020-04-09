package polymorphism;

public class Loan extends Bank {
     double interestRate;
     int numOfPayment;
     double loanAmount;

    public Loan(int accountNum, String accountName, double balance, double interestRate, int numOfPayment, double loanAmount) {
        super(accountNum, accountName, balance);
        this.interestRate = interestRate;
        this.numOfPayment = numOfPayment;
        this.loanAmount = loanAmount;
    }

     double calculateMonthlyPayment(){
        double monthlyPayment=this.loanAmount*(1+this.interestRate)/this.numOfPayment;
        return monthlyPayment;
    }
    double calculateTotalPayment(){
        double totalPayment=this.loanAmount*(1+this.interestRate);
        return totalPayment;
}}
