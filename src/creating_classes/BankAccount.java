package creating_classes;

public class BankAccount {
    String userName;
    double accountBalance;
    int accountNumber;
    public BankAccount(String name, int balance, int number){
       this.userName=name;
       this.accountBalance=balance;
       this.accountNumber=number;
   }
   public void checkBalance(){
        System.out.format("Your balance is "+ "%.2f\n",this.accountBalance);
   }
    public void addMoney(){
        this.accountBalance +=1000;
    }
    public void addMoney(double amount){
        this.accountBalance +=amount;
    }
    public void drawMoney(){
        this.accountBalance -=675;
    }
    public void drawMoney(double amount){
        this.accountBalance -=amount;
    }
    public static void main(String[] args) {
        BankAccount myAccount= new BankAccount("Current", 2500, 030710);
        myAccount.checkBalance();
        myAccount.addMoney();
        myAccount.checkBalance();
        myAccount.addMoney(125.00);
        myAccount.checkBalance();
        myAccount.drawMoney();
        myAccount.checkBalance();
        myAccount.drawMoney(325.00);
        myAccount.checkBalance();}
}
