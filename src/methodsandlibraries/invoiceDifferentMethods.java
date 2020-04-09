package methodsandlibraries;

public class invoiceDifferentMethods {
    public static void main(String[] args) {
        elBill(777);
    }
    public static  String elBill (int consumption) {
        String decision;
        if(consumption>=500 && consumption<1000){

            decision="Good job";
        }
        else if (consumption>1000 && consumption<=1500){

            decision="Not Bad";
        }
        else{
            decision="Start saving energy";
        }
        return decision;

    }
    public static String internetSpeed(int speed){
        String evaluate;
        if(speed>100){
            evaluate="Good speed";
                    }
        else if (speed>300){
            evaluate="Super speed";
        }
        else{
            evaluate="Unknown data";
        }

        return evaluate;
    }

    }
