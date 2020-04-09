package polymorphism;

public class Bank {
    protected int accountNum;
    protected String accountName;
    protected double balance;

    public Bank(int accountNum, String accountName, double balance) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ATTRIBUTES\n" +
                "accountNum=  " + accountNum +
                ", accountName='  " + accountName + '\'' +
                ", balance=  " + balance ;
    }
    public void addMoney(double amount){
this.balance+=amount;
    }
    public void drawMoney(double amount){
        if(amount<this.balance){
            this.balance-=amount;
        }
        else{
            System.out.println("Not enough balance");
        }

    }
    public void changeAccountName(String newName){
this.accountName=newName;
    }
}
