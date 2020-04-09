package creating_classes;

public class CipherTest {
    public static void main(String[] args) {
        Cipher myCip= new Cipher("java",6);
        System.out.println(myCip.getText());
        System.out.println(myCip.cipherText());
        System.out.println(myCip.deChiperText());
    }
}
