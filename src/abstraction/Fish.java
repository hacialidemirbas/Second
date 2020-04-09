package abstraction;

public class Fish extends AnimalAbsract {
    int sizeinFt;
    boolean canEat;
    void swim(){
        System.out.println("Fish can swim");
    }

    @Override
    boolean isMammal() {
        return false;
    }

    @Override
    String mate() {
        return null;
    }
}
