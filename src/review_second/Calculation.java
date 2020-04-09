package review_second;

public class Calculation {
    public static void main(String[] args) {
doCalculation(3,5,"subst");
    }
    public static void doCalculation(int firstNumber,int secondNumber, String operation){
        if(operation.equalsIgnoreCase("add")){
            System.out.println(firstNumber+secondNumber);
        }
        if(operation.equalsIgnoreCase("subst")){
            System.out.println(firstNumber-secondNumber);
        }
        if(operation.equalsIgnoreCase("multipl")){
            System.out.println(firstNumber*secondNumber);
        }
        if(operation.equalsIgnoreCase("divide")){
            System.out.println(firstNumber/secondNumber);
        }

    }
}
