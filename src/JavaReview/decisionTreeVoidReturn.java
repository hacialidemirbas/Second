package JavaReview;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
public class decisionTreeVoidReturn {
    public static void main(String[] args) {
        suggestDestination();

    }
    public static String suggestDestination(){
        Scanner scanner=new Scanner(System.in);
        String destination="";
                System.out.println("Do you want to go to sea or mountain");
                String answer=scanner.nextLine();
                if(answer.equalsIgnoreCase("sea")){
                    System.out.println("east or west?");
                    answer=scanner.nextLine();
                    if(answer.equalsIgnoreCase("east")){
                        destination="Florida";
                    }
                    else if (answer.equalsIgnoreCase("west")){
                        destination="California";
                    }
                    else{
                        System.out.println("Wrong input");
                    }
                }
                else if (answer.equalsIgnoreCase("mountain")){
                    System.out.println("Midland or North?");
                    answer=scanner.nextLine();
                    if(answer.equalsIgnoreCase("North")){
                        destination="Vermont";
                    }
                    else if(answer.equalsIgnoreCase("Midland")){
                        destination="Kansas";

                    }
                    else{
                        System.out.println("Wrong input");
                    }


                }
                else{
                    System.out.println("Wrong input");
                }

                return destination;
    }

}
