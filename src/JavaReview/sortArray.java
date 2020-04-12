package JavaReview;
import java.util.ArrayList;
import java.util.Arrays;

public class sortArray {
        public static void main(String[] args) {
            ArrayList<Integer> orrArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,6,7,5,4,9,8));
           int tmp;
for (int i = 0; i < orrArrayList.size(); i++) {
                for (int j = i+1; j <orrArrayList.size(); j++) {
                    if (orrArrayList.get(i) > orrArrayList.get(j)) {
                        tmp = orrArrayList.get(i);
                        orrArrayList.set(i, orrArrayList.get(j));
                        orrArrayList.set(j, tmp);
                    }
                }
}
System.out.println(orrArrayList);

        }
    }

