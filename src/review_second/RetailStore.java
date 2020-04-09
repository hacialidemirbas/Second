package review_second;

public class RetailStore{
 private String Product;
private static int totalQuantities;
 private int Quantity;

    public RetailStore(String Product, int Quantity) {
        this.Product = Product;
        this.Quantity = Quantity;
        totalQuantities+=this.Quantity;
    }

    public  void receive(int buy){
    this.Quantity +=buy;
    totalQuantities+=buy;
}
public  void sellQuantity(int sell){
    this.Quantity -=sell;
    totalQuantities-=sell;
}

    public void showQuantity(){
        System.out.println(this.Product+"= " +this.Quantity);
    }
    public static void showTotalQuantity(){
        System.out.println("Total Quantity= "+totalQuantities);
    }
}
