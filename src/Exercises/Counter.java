package Exercises;

public class Counter {
    private int counter;
    private	int limit;
    private	static int nCounters=0;

    public Counter(int counter, int limit) {
        this.counter = counter;
        this.limit = limit;
    }

    public  void increment(){
        if(counter<limit){
            counter++;}
    }
    public  void decrement(){
        if(counter>0){
            counter--;}
    }
    public static int getNCounters(){
        return nCounters;}

    public int getCounter() {
        return counter;
    }
}
