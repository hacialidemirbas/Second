package Interface;
public class DiceBias implements Dices {
    private int biasFactor;
    public DiceBias(int biasFactor){
        this.biasFactor=biasFactor;
    }

    public int getBiasFactor() {
        return biasFactor;
    }

    public void setBiasFactor(int biasFactor) {
        this.biasFactor = biasFactor;
    }
    public void roll(){
        System.out.println((int)(Math.random()*faces)+1);
    }
    public void rollTwice(){
        System.out.print((int)(Math.random()*faces)+1+",");
        System.out.println((int)(Math.random()*faces)+1);
    }
    public void rollTriple(){
        System.out.print((int)(Math.random()*faces)+1+",");
        System.out.print((int)(Math.random()*faces)+1+",");
        System.out.println((int)(Math.random()*faces)+1);
    }
    public void biasedRoll(){
        if(this.biasFactor>faces){
            System.out.println("Bias too large set 6 or less than 6");
        }
        else if(this.biasFactor==faces){
            System.out.println(faces);
        }
        else if(this.biasFactor<faces){
            System.out.println((int)(Math.random()*(faces-this.biasFactor+1)+this.biasFactor));
        }
        else{
            System.out.println("Bias can not be negative");
        }
    }
    public void rollEmpty(){
        System.out.println("Try again");
    }
    @Override
    public String toString() {
        return "DiceBias{" +
                "biasFactor=" + biasFactor +
                '}';
    }
}
