package OCA.items;

public class Car {
    private int stickerPrice;
    private int managerPrice;

    public void setManagerPrice(int managerPrice) {
        this.managerPrice = managerPrice;
    }

    public Car(int stickerPrice) {
        this.stickerPrice = stickerPrice;
    }
}
