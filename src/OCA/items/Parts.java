package OCA.items;

public class Parts {
    int stickerPrice;
    private int managerPrice;

    public void setManagerPrice(double managerPrice) {
        this.managerPrice = (int) managerPrice;
    }

    public Parts(int stickerPrice) {
        this.stickerPrice = stickerPrice;
    }
}
