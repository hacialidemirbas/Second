package MD_February9th;

public class LetterGrades {
    public static void main(String[] args) {
        int grade =60;

        if(grade<0){
            System.out.println("Grade can not be less than 0 !");
        }
        else if (grade<50){
            System.out.println("Fail");
        }
        else if(grade<60){
            System.out.println("D");
        }
        else if (grade<70){
            System.out.println("C");
        }
        else if (grade<80){
            System.out.println("B");
        }
        else if (grade<90){
            System.out.println("A");
        }
        else if (grade<101){
            System.out.println("A+");
        }
        else {
            System.out.println("The grade can not be larger than 100");
        }
    }
}
