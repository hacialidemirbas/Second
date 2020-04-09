package Arrays;

public class toFindMaxValue {
    public static void main(String[] args) {
        int myarr[]={99,109,5,3,2,98};
        System.out.println(findMax(myarr));
int myArray[]=new int []{1,2,3,4,15,6,7,8,9,10,155};
int max =myArray[0];//pick one number and check with others, if next one is bigger replace it, otherwhise keep it.
for(int i=1;i<myArray.length;i++){
    if(myArray[i]>max){
        max=myArray[i];
    }
}System.out.println(max);
    }
    public  static int findMax(int[]arr){
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
