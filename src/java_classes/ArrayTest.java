package java_classes;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayOpps myArray= new ArrayOpps();
        int[]arr={1,2,3,4,5,6,7,7,8};
        int index= myArray.findIndexInt(arr, 7);
        System.out.println(index);
        statArrays myStat= new statArrays(arr);
        System.out.println(myStat.findAverage());
        System.out.println(myStat.findMax());
        int maxIndex=myStat.findMaxIndex();
        System.out.println(maxIndex);




    }
}
