    //Program to calculate Percentage of 5 Subjects

import java.util.Scanner;
public class ex_1 {
   public static void main(String[] args) {
       System.out.println("CBSE Percentage Calculator");

       Scanner mk = new Scanner(System.in);
       int total = 500;
       System.out.println("Enter English Marks");
       int Eng = mk.nextInt();
       System.out.println("Enter Hindi Marks");
       int Hin = mk.nextInt();
       System.out.println("Enter Science Marks");
       int Sci = mk.nextInt();
//
       System.out.println("Enter Math Marks");
       int Mh = mk.nextInt();
//
       System.out.println("Enter History Marks");
       int His = mk.nextInt();
//
       int sum = Eng + His + Sci + Mh + Hin;
//
//
       System.out.print("Total Marks Sum is :");
       System.out.println(sum);
       int per = (sum * 100) / total;
       System.out.println("you got "+per+"%");
//
//
//
//
//
   }
}





