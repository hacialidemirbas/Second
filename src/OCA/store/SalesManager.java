package OCA.store;

import OCA.store.saleItems.Car;
import OCA.store.saleItems.ForSale;
import OCA.store.saleItems.Parts;
import OCA.store.saleItems.Truck;

import java.util.List;

public class SalesManager {
    public static void getManagerPrice(List<ForSale> itemsForSale) {
        for (ForSale forSale : itemsForSale) {
            if (forSale instanceof Car) {
                System.out.println(forSale.getStickerPrice() * .75);
            } else if (forSale instanceof Truck) {
                System.out.println(forSale.getStickerPrice() * .60);
            } else if (forSale instanceof Parts) {
                System.out.println(forSale.getStickerPrice() * .80);
            }
        }
    }
    /*public static void getManagerPrice(List<ForSale> itemsForSale){
        for(ForSale forSale:itemsForSale){System.out.println(forSale.getStickerPrice()*.75);}
    }*/
    /*public static void getManagerPrice(ForSale forSale){
        System.out.println(forSale.getStickerPrice()*.75);
    }*/
    /*public static void getManagerPriceForCar(Car car){
        System.out.println(car.getStickerPrice()*.75);
    }
    public static void getManagerPriceForTruck(Truck truck){
        System.out.println(truck.getStickerPrice()*.75);
    }
    public static void getManagerPriceForParts(Parts parts){
        System.out.println(parts.getStickerPrice()*.75);
    }*/
}
