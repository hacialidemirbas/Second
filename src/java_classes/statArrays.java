package java_classes;


public class statArrays extends ArrayOpps {
    private int min;
    private int max;
    private int[] arr;
    private double average;

    public statArrays(int[] arr) {
        super();
        this.min = 0;
        this.max = 0;
        this.average = 0;
        this.arr=arr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double findAverage() {
        int total = 0;
        for (int i = 0; i < this.arr.length; i++) {
            total += this.arr[i];
        }
        this.average = total / this.arr.length;
        return this.average;
    }

    public int findMin() {
        this.min = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] < this.min) {
                this.min = this.arr[i];
            }

        }
        return this.min;
    }
    public int findMaxIndex(){
        super.indexInt=super.findIndexInt(this.arr, this.findMax());
        return super.indexInt;
    }

    public int findMax() {
        this.max = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] > this.max) {
                this.max = this.arr[i];
            }
        }
        return this.max;
    }}