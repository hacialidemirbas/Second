package polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Animal cat=new Cat();
        Animal dog= new Dog();
        animal.makesound();
        cat.makesound();
        dog.makesound();

    }

}
