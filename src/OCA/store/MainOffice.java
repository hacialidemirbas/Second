package OCA.store;

import OCA.store.saleItems.Car;
import OCA.store.saleItems.ForSale;
import OCA.store.saleItems.Parts;
import OCA.store.saleItems.Truck;

import java.util.ArrayList;

public class MainOffice {
    public static void main(String[] args) {
Car camry=new Car(22000);
//SalesManager.getManagerPriceForCar(camry);
Parts engine=new Parts(3500);
Truck ram= new Truck(50000);

/*SalesManager.getManagerPrice(camry);
SalesManager.getManagerPrice(engine);*/
        ArrayList<ForSale> itemsForSale= new ArrayList<>();
        itemsForSale.add(camry);
        itemsForSale.add(engine);
        itemsForSale.add(ram);
        SalesManager.getManagerPrice(itemsForSale);
    }
}
