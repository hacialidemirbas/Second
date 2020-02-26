package methodsandlibraries;

public class checkPassword {
    public static void passwordCheck(String password){
        if ( password.length()>6){
            System.out.println("Pasword is OK");
        }
        else{
            System.out.println("Password is NOT OK");
        }
    }

    public static void main(String[] args) {
        passwordCheck("nilfilsa");
        String check=passwordCheck1("Kolombiya");
        System.out.println(check);
        System.out.println(isPasswordGood("tucson"));
        String password = "123456";
        if (isPasswordGood(password)){
            System.out.println("Lenght is OK");
        }


    }
    public static String passwordCheck1 (String password){
        String result;
        if (password.length()>=6){
            result="OK";
        }
        else {
            result= "NOT OK";
        }
        return result;
    }
    public static boolean isPasswordGood(String password){
        boolean result;
        if(password.length()>=6){
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }

}
