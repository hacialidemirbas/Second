package StaticMethods;

import java.util.ArrayList;

public class Initializer {
    private static int counter=0;
    private static final int numBuckets=45;
    private static final ArrayList<String> values =new ArrayList<>();

    public static void main(String[] args) {
      //  numBuckets=5; DOES NOT COMPILE
        values.add("changed");

    }
    private static final int numSecondsPerHour;
    static{
        int numSecondsPerMinute=60;
        int numMinutesPerHour=60;
        numSecondsPerHour=numSecondsPerMinute*numMinutesPerHour;
    }
    private static int one;
    private static final int two;
    private static final int three=3;
   // private static final int four; DOES NOT COMPILE not inialized in static block
    static{
        one=1;
        two=2;
       // three=3;DOES NOT COMPILE already initialized once
        //two=4; DOES NOT COMPILE already initialized once
    }

}
