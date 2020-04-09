package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other= new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
        public void helpOtherGooseSwim(){
            Bird other=new Goose();
            //FOLLOWING 2 LINES DO NOT COMPILE
         //   other.floatInWater(); Because 
        //    System.out.println(other.text);


    }
}
