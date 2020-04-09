package creating_classes;

public class ClassWith3Att {


    private    int atrbt1;
    private  int atrbt2;
    private    int atrbt3;


    public ClassWith3Att(int atrbt1,int atrbt2, int atrbt3){
        this.atrbt1=atrbt1;
        this.atrbt2=atrbt2;
        this.atrbt3=atrbt3;
    }
    public int getAtrbt1(){
        return atrbt1;
    }
    public void setAtrbt1(int atrbt1){
        this.atrbt1=atrbt1;
    }
}
