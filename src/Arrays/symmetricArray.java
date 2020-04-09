package Arrays;

public class symmetricArray {
    public static void main(String[] args) {
        int myArr[]={1,2,3,3,2,1,4};
       int myArr1[]={1,2,3,4,3,2,1};
       checkSymmetric(myArr1);
        checkSymmetric(myArr);
    }
   /* public static void Chec(String[] args) {
        int sym[]={1,2,3,3,2,1};
        int index=sym.
        Symmetric(sym);
    }
    public static boolean Symmetric(int[] args) {

        boolean issym=true;
        for(int i=0; i<(sym.length)/2;i++){
            if(sym[i]==(sym.length-1)-i){
                issym=true;
            }
            else{
                issym=false;
            }

        }
        return issym;
    }*/
   public static void checkSymmetric(int[]arr){
       int index=arr.length-1;
       int counter=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=arr[index]){
               counter++;
           }
           index--;
           System.out.println("index: "+index);
       }
       if (counter==0){
           System.out.println("Symmetric");

       }
       else{
           System.out.println("Not Symmetric");
       }
   }


}
