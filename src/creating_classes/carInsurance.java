package creating_classes;

public class carInsurance {

    private int modelYear;
    private int numOfTickets;
    private int numOfAccidents;
    private double priceOffer;
    final double basePrice=99.99;
    public carInsurance(  int modelYear, int numOfTickets,  int numOfAccidents){
        this.modelYear=modelYear;
        this.numOfTickets=numOfTickets;
        this.numOfAccidents=numOfAccidents;
        this.priceOffer=0;
    }
    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
            }
    public int getModelYear(){
        return this.modelYear;
    }
    public void setNumOfTickets(){
        this.numOfTickets=numOfTickets;
    }
    public int getNumOfTickets(){
        return this.numOfTickets;
    }
    public void setNumOfAccidents(){
        this.numOfTickets=numOfTickets;
    }
    public int getNumOfAccidents(){
        return this.numOfTickets;
    }
    public double makeOffer (int currentYear){
        double total= this.basePrice+(currentYear-modelYear)*50 + (30*numOfTickets)+(100*numOfAccidents);
        return total;
    }

    @Override
    public String toString() {
        return "carInsurance{" +
                "modelYear=" + modelYear +
                ", numOfTickets=" + numOfTickets +
                ", numOfAccidents=" + numOfAccidents +
                ", priceOffer=" + priceOffer +
                ", basePrice=" + basePrice +
                '}';
    }
}
