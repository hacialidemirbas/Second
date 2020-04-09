package creating_classes;

import java.util.Arrays;

public class ArrayQuestionsTest {
    public static void main(String[] args) {
        ArrayQuestion obj1 = new ArrayQuestion();
        int[] array1 = obj1.returnArray();
        System.out.println(Arrays.toString(array1));
        obj1.printOdds(array1);
        ArrayQuestion obj2 = new ArrayQuestion(30);
        int[] array2 = obj2.returnArray();
        System.out.println();
        System.out.println(Arrays.toString(array2));
        obj2.printOdds(array2);

    }
}
