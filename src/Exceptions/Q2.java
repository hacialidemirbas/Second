package Exceptions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
printIndex();
    }
    public static void printIndex(){
        Scanner scan=new Scanner(System.in);
        String arr[][]={{"Java","Selenium","Cucumber"},{"Encapsulation","Inheritance","Interfaces"}};
        System.out.println("Enter index1 : ");
        int index1=scan.nextInt();
        System.out.println("Enter index2 : ");
        int index2=scan.nextInt();
        try{
            System.out.println(arr[index1][index2]);
            System.out.println("Item retrieved succesfully");
        }
        catch(Exception e){
            System.out.println("Invalid index");
        }

    }
}
