package pond.duck;

import pond.goose.Goose;

public class GooseWatcher  {
    public void Watch(){
        Goose goose= new Goose();
        //goose.floatInWater(); // DOES NOT COMPILE
        String numbers="123456789";
        int num=Integer.parseInt(numbers);
        Integer nums=Integer.valueOf(numbers);
        Integer a=Integer.valueOf("1");
    }

    public static void main(String[] args) {
        String numbers="123456789";
        int num=Integer.parseInt(numbers);
        Integer nums=Integer.valueOf(numbers);
        System.out.println(nums);
        System.out.println(num);
        Integer a=Integer.valueOf("2");
        Integer b= Integer.valueOf("3");
        System.out.println(a+b);
    }
}
