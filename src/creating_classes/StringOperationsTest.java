package creating_classes;

import java.util.Arrays;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStr=new StringOperations("sunday is fun day!");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.FirstLetterUpperCase());
        System.out.println(Arrays.toString(myStr.returnSentence()));
        System.out.println(Arrays.toString(myStr.returnString()));

    }
}
