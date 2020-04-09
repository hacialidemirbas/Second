package StaticMethods;

public class Gorilla {
   public static int count;
   public static void addGorilla(){
       count ++;
   }
   public void babyGorilla(){
       count ++;
   }
   public void announceBabies(){
       addGorilla();
       babyGorilla();
   }
   public static void announceBabiesToEveryOne(){
       addGorilla();
     //  babyGorilla(); DOES NOT COMPILE
   }
   public int total;
  // public static double average=total/count; // DOES NOT COMPILE

}
