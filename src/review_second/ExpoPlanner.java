package review_second;

public class ExpoPlanner extends Planner {
    String expoName;
    String[][]checkList;
    ExpoPlanner(){
        super();
        this.expoName="default";
        this.checkList= new String [5][4];
    }

    void listAll(){
        System.out.println("Date\tt"+"Event|t|t"+"Chack List");
        for(int i=0;i<super.dateAndEvent.length;i++){
            System.out.print(super.dateAndEvent[i][0]+"\t\t"+super.dateAndEvent[i][1]);
            for(int j=0; j<this.checkList[i].length;j++){
                System.out.print(this.checkList[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void modifyCheckList(String date, String[] checkList){
        int index = 0;
        for(int i=0;i<super.dateAndEvent.length;i++){
            if(super.dateAndEvent[i][0].equalsIgnoreCase("date")){
                index=i;

            }
        }
        this.checkList[index]=checkList;
    }

}
