package creating_classes;

public class Bicycle {
    String Bicyclecolor;
    int Bicyclesize;

public Bicycle(String color,int size){
Bicyclecolor=color;
Bicyclesize=size;
}
public void goFast(){
    System.out.println("Going fast");
}
public void goFaster(){
    System.out.println("Go faster");
}


    public static void main(String[] args) {
        Bicycle myBike= new Bicycle("White", 30);
        myBike.goFast();
        myBike.goFaster();


    }
        }