package OCA;

public class creatingStrings {
    public static void main(String[] args) {
        //String literal
        String name1="john";
        //String object
        String name2=new String ("John");
        //string literal
        String name3="john";
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        String str1="text";
        String str2="SomeOtherText";
        System.out.println(3+5+str1+1+3);
        System.out.println(3+(5+str1)+1+3);
        System.out.println(3+5+(str1)+(1+3));

    }
}
