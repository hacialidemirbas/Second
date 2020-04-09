package creating_classes;

public class CoffeeMaker {
    private int cupsQuantity;
    private int timer;
    private boolean brew;

    public CoffeeMaker (int cupsQuantity){
        this.cupsQuantity=cupsQuantity;
        this.timer=timer=0;
        this.brew=false;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "cupsQuantity=" + cupsQuantity +
                ", timer=" + timer +
                ", brew=" + brew +
                '}';
    }

    public int getCupsQuantity() {
        return cupsQuantity;
    }

    public void setCupsQuantity(int cupsQuantity) {
        this.cupsQuantity = cupsQuantity;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isBrew() {
        return brew;
    }

    public void setBrew(boolean brew) {
        this.brew = brew;
    }
    public void resetTimer(){
        this.timer=0;
        System.out.println("Timer resetted");
    }
    public void brewCoffee(){
        if(this.timer==0){
            System.out.println("Coffee started to brew");
        }
        else{
            System.out.println("Coffee will start to brew in "+this.timer+" minutes");
        }
    }
}
