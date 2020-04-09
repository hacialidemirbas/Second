package review_second;

public class Planner {
    String plannerName;
    String[][]dateAndEvent;
    int index;
    int size;


    public Planner(String plannerName, int size) {
        this.plannerName = plannerName;
        this.dateAndEvent = dateAndEvent;
        this.size=size;
        this.index=0;
        this.size=5;
        for(int i=0;i<this.dateAndEvent.length;i++){
            this.dateAndEvent[i][0]=" ";
            this.dateAndEvent[i][1]=" ";
        }

    }
    Planner(){
        this.plannerName="Default";
        dateAndEvent=new String[5][2];
        this.index=0;
        this.size=5;
        for(int i=0;i<this.dateAndEvent.length;i++){
            this.dateAndEvent[i][0]="Available ";
            this.dateAndEvent[i][1]="Available ";
        }
    }
    private void displayPlanner(){
        System.out.println("--Date--\t\t--Event--");
        for(String[] event:this.dateAndEvent){
            System.out.println(event[0]+"\t\t"+event[1]);
        }
    }
    void addEvent(String date,String event){
        if(this.index<this.size){
        this.dateAndEvent[this.index][0]=date;
        this.dateAndEvent[this.index][1]=event;
        this.index++;}
        else{
            System.out.println("Planner is full");
        }
        displayPlanner();


    }
    void deleteEvent(String date){
for( int i=0;i<this.dateAndEvent.length;i++){
    if(this.dateAndEvent[i][0].equalsIgnoreCase(date)){
        this.dateAndEvent[i][0]=" ";
        this.dateAndEvent[i][1]=" ";
    }
   }
displayPlanner();

    }
}
