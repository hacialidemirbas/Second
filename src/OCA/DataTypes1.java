package OCA;

public class DataTypes1 {
    public static void main(String[] args) {
        String one=new String("A");
        String two= new String ("B");
        one=two;
        System.gc();
        StringBuilder sb= new StringBuilder("Robert");
        sb.append("Jennifer");
        StringBuilder sb1= new StringBuilder("Robert");
        sb1.delete(2, 5);
        StringBuilder sb2= new StringBuilder("Robert");
        sb2.insert(2, 4);
        sb2.insert(2, "ALi");
        StringBuilder sb3= new StringBuilder("Robert");
        sb3.reverse();
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

    }
}
