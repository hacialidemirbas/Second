package Package15F;

public class Loop2468 {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 7; j++) {
                if (number > 17 && number < 23) {
                    System.out.print("  " + "   \t");

                }
                else {
                    System.out.print(number+ "\t\t");

                }
                number += 2;

            }


                System.out.println();

        }
    }
}