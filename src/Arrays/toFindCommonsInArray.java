package Arrays;

public class toFindCommonsInArray {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6,7,8,9,10};
        int array2[]={2,4,6,8,10,11,12,13,14};
        for(int i=0; i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.print(array1[i]+"  ");
                }
            }
        }

    }

    }
