package Arrays;

public class FindElements {
    public static void main(String[] args) {
        String []myArrays={"abc", "defgh", "qwerty", "asd"};
        int count=0;
        for(int i=0; i<myArrays.length;i++){
            if (myArrays[i].length()<4){
                count++;

            }

        }
        System.out.println(count);
    }
}
