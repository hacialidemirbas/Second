package Arrays;

public class Commons {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6,7,8,9,10};
        int array2[]={2,4,6,8,10,12,14,16,18};
        findCommons(array1,array2);
        System.out.println();
        for (int i=0; i<array1.length;i++){
            boolean b=false;
            for (int j=0;j<array2.length;j++){
                if(array1[i]!=array2[j]){
                    b=false;
                }
                else{
                    System.out.print(array1[i]);}
                }

            }

    }
    public static void findCommons(int[]a, int b[]){
        for(int i=0; i<a.length;i++){
            int counter=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    counter++;

                }
            }
            if (counter>0){
                System.out.print(a[i]);
            }
        }

    }
}
