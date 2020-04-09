package Arrays;

public class First {
    public static void main(String[] args) {

            String[] cities={"New York City","Seatle", "Los Angeles","Ann Arbor", "Tucson"};
            for(int i=0; i<5;i++){
                System.out.print(cities[i]+"  ");

        }
        System.out.println();
            for(int i=cities.length-1;i>=0;i--){
                System.out.print(cities[i]+"  ");
            }
    }
}
