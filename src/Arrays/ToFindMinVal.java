package Arrays;

public class ToFindMinVal {
    public static void main(String[] args) {
        int val[]={99,88,77,1,66,3};
        int min=val[0];
        for(int i=0;i<val.length;i++){
            if(val[i]<min){
                min=val[i];
            }
        }
        System.out.println(min);
    }
}
