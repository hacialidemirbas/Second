package Package7m;

public class decideGateSwitchCase {
    public static void main(String[] args) {
        String destination="America;";
        switch (destination){
            case "Europe":
                System.out.println("Go to the Gate A");
                break;
            case"Africa":
                System.out.println("Go to the Gate B");
                break;
            case "asia":
                System.out.println("Go to the Gate C");
                break;
            case "america":
                System.out.println("Go to the Gate D");
                break;
                default:
                    System.out.println("Not a destination");
        }


    }
}
