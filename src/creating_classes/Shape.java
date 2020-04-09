package creating_classes;

public class Shape {
    char Symbol;
    int width;
    int heigth;
    public Shape(){
        this.Symbol='*';
        this.width=10;
        this.heigth=15;

    }
    public Shape(char Symbol,int width,int heigth){
Symbol=Symbol;
width=width;
heigth=heigth;
    }
    public void printPyramid(){
        for(int i=0; i<this.heigth;i++){
            for(int j=0;j<i;j++){
                System.out.print(Symbol+" ");
            }
            System.out.println();
        }
    }
    public void printPyramid(boolean space){
        for(int i=0; i<this.heigth;i++){
            for(int j=0;j<i;j++){
                System.out.print(Symbol);
            }
            System.out.println();
        }
    }
    public void printRectangle(){
        for(int i=0;i<this.heigth;i++){
            for(int j=0;j<this.width;j++){
                System.out.print(Symbol+" ");
            }
            System.out.println();
        }
    }
}
