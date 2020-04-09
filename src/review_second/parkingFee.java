package review_second;

public class parkingFee {
    public static void main(String[] args) {
        calculateParkingFee(3,true);
        calculateParkingFee(5,false);
        calculateParkingFee(15,false);
    }
    public static void calculateParkingFee(int duration, boolean member){

        if (member){
            System.out.println("No charge");
        }
        else if(duration >=1&&duration<=2){
            System.out.println("$3");
        }
        else if(duration>=3&&duration<=6){
            System.out.println("$5");
        }
        else if(duration>=7&&duration<=12){
            System.out.println("$10");;

        }
        else if (duration>12){
            System.out.println("$15");
        }
    }
}
