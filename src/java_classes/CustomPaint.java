package java_classes;

public class CustomPaint extends Paint{
    protected String durability;
    protected String glossiness;
    public CustomPaint(String colorName,double squareFeet,String durability,String glossiness){
        super(colorName,squareFeet);
        this.durability=durability;
        this.glossiness=glossiness;
    }
    public void changeGlossiness(String newGloss){
        this.glossiness=newGloss;
    }
    public void changeDurability(String newDurable){
        this.durability=newDurable;
    }
    public double calculateCustomPrice(){
        double pricePerGallon=32.99;
        if(this.glossiness.equalsIgnoreCase("glossy")){
            pricePerGallon+=2;
        }
        else if (this.glossiness.equalsIgnoreCase(("extra glossy"))){
            pricePerGallon+=3;
        }
        else{
            System.out.println("Not proper value");
        }
        if(this.durability.equalsIgnoreCase("durable")){
            pricePerGallon+=2;
        }
        else if(this.durability.equalsIgnoreCase("super durable")){
            pricePerGallon+=3;
        }
        super.totalPrice=super.squareFeet/100*pricePerGallon;
        return super.totalPrice;


    }
}
