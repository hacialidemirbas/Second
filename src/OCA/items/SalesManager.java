package OCA.items;

public class SalesManager {
    public static void setPartsManagerPrice(Parts part){
        part.setManagerPrice(part.stickerPrice*0.8);

    }
}
