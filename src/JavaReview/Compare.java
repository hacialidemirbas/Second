package JavaReview;

public class Compare {
    public static void main(String[] args) {
        int []grades={90,75,50,100,65,80};
        System.out.println(max(grades));
    }
    public static int max(int[]numbers){
        int maxGrade=numbers[0];
        for(int number:numbers){
            if(number>maxGrade){
                maxGrade=number;
            }
        }
        return maxGrade;
    }
}
