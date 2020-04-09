package creating_classes;

public class ExampleEncapsulation {
    private int id;
    private double salary;
    public ExampleEncapsulation (int id, double salary){
        this.id=id;
        this.salary=salary;
    }
    void setId(int id){
        this.id=id;

    }
    public int getId(){
        return this.id;
    }
}
