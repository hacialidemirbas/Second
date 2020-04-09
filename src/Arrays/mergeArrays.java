package Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int merge1[]={1,2,3};
        int merge2[]={4,5,6};
        arrayMerges(merge1,merge2);


    }
    public static void arrayMerges(int merge1[], int merge2[]){
        int lenMergedArrays=merge1.length+merge2.length;
        int[] mergedArray= new int[lenMergedArrays];
        //adding values of the first array(merged1)
        for (int i=0;i<merge1.length;i++){

           mergedArray[i] =merge1[i];

            }
        //adding values of the first array(merged2)
        for (int i=0;i<merge2.length;i++){
            mergedArray[i] =merge2[i];
        }
        // to print (show) merged elements
        for (int i=0; i<mergedArray.length;i++){
            System.out.println(mergedArray[i]);
        }
    }
}
