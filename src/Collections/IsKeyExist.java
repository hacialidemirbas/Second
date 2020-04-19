package Collections;

import java.util.HashMap;

public class IsKeyExist {
    public static void main(String[] args) {

        HashMap<String, String> sample = new HashMap<>();
        sample.put("a","A");
        sample.put("b","B");
        System.out.println(isKeyExist(sample,"a"));
    }
    public static boolean isKeyExist(HashMap<String,String> a,String b){
        boolean result=false;
        for(String key:a.keySet()){
            if(key.equals(b)){
                result=true;
                break;

            }
            else{
                result=false;
            }

        }
        return result;
    }
}
