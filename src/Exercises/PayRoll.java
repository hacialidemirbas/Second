package Exercises;

import java.util.Scanner;

public class PayRoll {
    public static void main(String[] args) {

        Scanner stdin= new Scanner(System.in) ;

        int total=0;
        int nEmployees=2;
        for(int i=0;i<nEmployees;i++){
            System.out.println("enter wage rate");
            int weekhours=0;

            int wagerate=stdin.nextInt();
            for(int j=0;j<5;j++){
                System.out.println("enter hours");
                int hours=stdin.nextInt();
                weekhours+=hours;
            }
            System.out.println("weekhours : "+weekhours);
            total+=weekhours*wagerate;

        }
        System.out.println("total pay for all employees"+total);
    }}
