package abstraction;

public class Duck extends AnimalAbsract {
    String beakColor="yellow";
    void swim(){
        System.out.println("Duck can swim");
    }
    void quack(){
        System.out.println("Duck can quack");
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
