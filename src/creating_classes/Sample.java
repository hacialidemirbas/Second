package creating_classes;

public class Sample {

        int a;
        int b;
        public Sample(){
            a=30;
            b=40;
        }
        public Sample(int a){

        }



    public static void main(String[] args) {
        Sample s1= new Sample();
        System.out.println("s1: "+s1.a);
    }
}
