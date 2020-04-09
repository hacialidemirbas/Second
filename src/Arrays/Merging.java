package Arrays;

public class Merging {
    public static void main(String[] args) {
       int a[]={1,22,3,4,5,6};
       int b[]={2,4,6,8,10};
       merge(a,b);


    }
    static void merge(int[] arr1, int[] arr2){
       int arr3Length= arr1.length+arr2.length;
       int arr3[]= new int [arr3Length];
       for(int i=0; i<arr1.length;i++){
           arr3[i]=arr1[i];
       }
       for (int i=arr1.length;i<arr3.length;i++){
           arr3[i]=arr2[i-arr1.length];
       }
       for(int i=0; i<arr3.length;i++){
           System.out.print(arr3[i]+" ");
       }
        System.out.println();
       int max=0;
        for(int i=0; i<arr3.length;i++){
          if(arr3[i]>max){
              max=arr3[i];
          }
        }
        System.out.print(max);
        System.out.println();
        int index=0;
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    index++;
                }
            }
        }System.out.print(index);
        System.out.println();
        int common[]= new int[2];
        int index1=0;
        for (int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    common[index1]=arr1[i];
                    System.out.print(common[index1]+" ");
                    index1++;
                }
            }
        }

    }
}
