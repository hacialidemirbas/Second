package pond.inland;

import pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird= new Bird();
        //compile error in the following lines
        //bird.floatinWater(); //not in the same package as Bird
        //System.out.println(bird.text); //not in the same package as Bird
    }
}
