package creating_classes;

public class BankAccountTest {
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
