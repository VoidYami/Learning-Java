    //Program to convert kilometer to Miles

import java.util.Scanner;

public class ex_1_4 {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter the number");
        int kilo = nm.nextInt();
        System.out.print(kilo);
        System.out.print("km");

        System.out.print(" = ");

        double miles = kilo * 0.62137;
        System.out.print(miles);
        System.out.print("miles");
    }
}
