package OCA.store.saleItems;

public class Car implements ForSale{
    private double stickerPrice;

    public Car(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }
}
