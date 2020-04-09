package Exercises;

public class MyDate {
    int day;
    int month;
    int year;
    public MyDate(){}
    public MyDate(int day, int month, int year){
        this.day=day;
       this. month=month;
        this.year=year;

    }

    @Override
    public String toString() {
        return "MyDate \t\t" +
                 + day +
                "\t\t" + month +
                "\t\t" + year;
    }

    public void setDate(int day,int month,int year) {
        this.day = day; this.month = month;this.year = year;
    }


}
