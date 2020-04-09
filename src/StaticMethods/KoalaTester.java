package StaticMethods;

public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);
        System.out.println(Koala.count);
        Koala k= new Koala();
        System.out.println(k.count);
        k=null;
        System.out.println(k.count);
        Koala.count=4;
        Koala k1= new Koala();
        Koala k2= new Koala ();
        k1.count=6;
        k2.count=7;
        System.out.println(Koala.count);
    }
}
