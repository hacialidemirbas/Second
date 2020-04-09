package Arrays;

public class commonArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,4,6,8,10};
        commonarrays(arr1,arr2);
    }
    public static void commonarrays(int arr1[],int arr2[]){
        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
