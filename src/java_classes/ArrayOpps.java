package java_classes;

public class ArrayOpps {
   protected int indexInt;
   protected int indexString;
    public ArrayOpps (int indexInt, int indexString){
        this.indexInt=indexInt;
        this.indexString=indexString;
           }

    public ArrayOpps() {

    }

    public int findIndexInt(int[]arr, int value){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==value){
                this.indexInt=i;
            }
        }
        return this.indexInt;
    }
    public int findIndexInt(String arr[], String value){
        for(int i=0; i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(value)){
                this.indexString=i;
            }
        }
        return this.indexString;
    }

    @Override
    public String toString() {
        return "ArrayOpps{" +
                "indexInt=" + indexInt +
                ", indexString=" + indexString +
                '}';
    }
}
