package OCA.store.saleItems;

public class Parts implements ForSale {
    private double stickerPrice;

    public Parts(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }
}
