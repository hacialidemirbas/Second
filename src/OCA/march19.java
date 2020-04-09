package OCA;

public class march19 {
    public static void main(String...args) {
        int arr[]=new int [5];
        int [][]arr2={{1,2,3,4},{5,6,7,78}};
        System.out.println(arr2[1][2]);
        printNumbers(arr);
        printNumbers(1,2,3,4,5667,8776);
        printNumbers(7);
        printNumbers();
        //varargs
    }
    public static void printNumbers (int ...numbers){
        for (int i:numbers){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void calculate(String name, int number,String...cityNames){//we can use varargs but at the end of the signature

    }

}
