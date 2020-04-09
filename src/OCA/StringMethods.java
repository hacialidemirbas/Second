package OCA;
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        int number=2;
        String city="Los Angeles";
        //length()
        System.out.println(city.length());//output 6
        int LengthOfMyString=city.length();
        //System.out.println(city.charAt(LengthOfMyString)); //returns error because there is no 11 char in Los Angeles
        System.out.println(city.indexOf("Angeles"));//output 4
        //System.out.println(city.LastIndexOf("s"));
        String partialText=city.substring(4);//starting from 4th index
        System.out.println(partialText);//output Angeles
        partialText=city.substring(2,6);//between 2-6
        System.out.println(partialText);// output s An
        System.out.println(city.toUpperCase());//All upper case, loutput LOS ANGELES
        System.out.println(city.toLowerCase());// all lover case, output:los angeles
        System.out.println(city);// city is still the original one, you can never change a String. it gives us a new string in each operation above
        String upperCaseCity=city.toUpperCase();
        String partialCityUp=upperCaseCity.substring(4);//Uppercase after 4th index
        System.out.println(partialCityUp);//ANGELES

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= sc.nextLine();
        if(name.startsWith("A"));



    }
}
