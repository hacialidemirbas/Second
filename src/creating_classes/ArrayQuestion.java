package creating_classes;

public class ArrayQuestion {
    int size;
    public ArrayQuestion(int size){
        this.size=size;

    }
    public ArrayQuestion(){
        this.size=5;
    }
    public int[]returnArray(){
        int arr[]=new int [this.size];
        int i=2;
        for(int j=0; j<this.size;j++){
            arr[j]=i;
            i+=2;

        }
        return arr;
    }
    public void printOdds(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2==1){
                System.out.print("i= "+i+"\t");
            }
        }
    }
}
