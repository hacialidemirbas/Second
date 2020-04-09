package abstraction;

public class TilingTest {
    public static void main(String[] args) {
        Tiling myTile= new Tiling("Nilfilsa", 5000, 0, "wood");
        System.out.println(myTile.calculateTotalMaterial());
        myTile.printQuote();
    }
}
