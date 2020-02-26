package methodsandlibraries;

public class printName {

    public static void main(String[] args) {
        System.out.println("Ali");
        printMyName();
        printMyName2("Ali");
        System.out.println(printMyName3());
        System.out.println(printMyName4(printMyName4("Ali4")));

    }
    public static void printMyName(){
        System.out.println("My name is Ali");
    }

    public static void printMyName2(String name) {
        System.out.println(name);

    }
    public static String printMyName3(){
        return "My name is Ali3";
    }

    public static String printMyName4(String name4) {
        return name4;
    }

}
