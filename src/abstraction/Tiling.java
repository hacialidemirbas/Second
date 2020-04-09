package abstraction;

public class Tiling extends Quote {
    private String material;
    Tiling(){
        super();
    }
public Tiling(String customerName,int totalSquareFeet,double price,String material){
    super(customerName, totalSquareFeet, price);
    this.material=material;
}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    double calculateTotalMaterial(){
        if(this.material.equalsIgnoreCase("wood")){
            return this.getTotalSquareFeet()*2.4;
        }
        else if(this.material.equalsIgnoreCase("metal")){
            return this.getTotalSquareFeet()*1.99;
        }
        else{
            System.out.println("Wrong material");
            return 0;
        }
    }

    double calculateTotalPrice() {

         this.setPrice(this.calculateTotalMaterial()+4*this.getTotalSquareFeet());
return this.getPrice();
    }

    void printQuote() {
        System.out.println(" "+"Customer Name : \t"+this.getCustomerName()+
                "Total SqrFeet : \t"+this.getTotalSquareFeet()+
                "Material price : \t"+this.calculateTotalMaterial()+
                "Total price : \t"+this.getPrice());

    }
}
