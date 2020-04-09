package creating_classes;

public class overloadedCost {
    public static void main(String[] args) {
        int baseprice=11;
        int shipping=2;
        System.out.format("Shipping included price: "+"%.2f\n",((baseprice)*1.1+shipping));
        cost(baseprice, shipping);
        cost(baseprice);
    }
    public static void cost(int b, int s){
        System.out.format("Shipping included price: "+"%.2f\n",((b)*1.1+s));

    }
    public static void cost (int b){
        System.out.format("Shipping not included price: "+"%.2f\n",((b)*1.1));
    }


}
