package MD_February1st;

public class FormatQuestion {
    public static void main (String[] args){
        String java = "Java is fun";
        float percentageLarge = 78.98f;
        double percentageSmall = 78.98000;
        System.out.format("Do you think %s \n",java);
        System.out.format("\t Yes %% %f of the people think it is fun \n",percentageLarge);
        System.out.format("\t Yes %% %.2f of the people think it is fun\n",percentageSmall);
        System.out.format("%s",java);


    }
}
