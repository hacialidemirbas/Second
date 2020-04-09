package creating_classes;

public class carInsuranceTest {
    public static void main(String[] args) {
        carInsurance abc= new carInsurance(2011, 1, 0);
        double myOffer= abc.makeOffer(2020);
        System.out.println(myOffer);
        carInsurance second = new carInsurance(2019,3,2);
        System.out.println(second.makeOffer(2020));

    }
}
