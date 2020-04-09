package methodsandlibraries;

public class f26_RandomNumber {
    public static void main(String[] args) {
        System.out.println((int)Math.random());//answer:0
        System.out.println((int)Math.random()*100);
        System.out.println((int)(Math.random()*100));
        for(int i=1;i<7;i++){
            System.out.print((int)(Math.random()*10));
        }
        int count=0;
        while (count<20){
            generatePass();
            count++;
        }
        for(int i=0;i<100;i++){
            System.out.println(100+(int)(Math.random()*100));

        }

    }
    public static void generatePass() {
        for (int i = 1; i < 7; i++) {
            System.out.print((int) (Math.random() * 10));
        }
        System.out.println();
    }
    public static String generatePassword(){
        String result="";
        for(int i=0;i<6;i++){
            result+=Math.random();
        }
        return result;
    }

}
