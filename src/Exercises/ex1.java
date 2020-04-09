package Exercises;


    public class ex1 {
        public String first = "instance";
        public ex1() {
            first = "constructor";
        }
        { first = "block"; }
        public void print() {
            System.out.println(first);
        }
        public static void main(String... args) {
            new ex1().print();

        }
    }

