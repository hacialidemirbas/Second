package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class surveySelfishness {
    public static void main(String[] args) {
        selfishnessTest();
        }

        public static void selfishnessTest () {
            String questions[] = {"Level your selfishness (0-1-):",
                    "You are the most important person in the world (0-10):",
                    "Nobody is like you (0-10):",
                    "You never share(0-10):"};
            int answer[] = new int[questions.length];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                answer[i] = scanner.nextInt();
            }
            //System.out.println(Arrays.toString(answer));
            int total=0;
            for(int score:answer){
                total+=score;

            }
            if(total<=10){
                System.out.println("Not selfish. You are awesome");
            }
            else if(total<=30){
                System.out.println("Selfish. It is OK!!");
            }
            else {
                System.out.println("Super selfish. Shame on you");
            }}}