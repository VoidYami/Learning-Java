    

import java.util.Scanner;

public class Ex_4_practice_question {
    public static void main(String[] args) {

       /*
        // question
        byte ph, ch, mh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        ph = sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        ch = sc.nextByte();
        System.out.println("Enter your marks in math");
        mh = sc.nextByte();

        float avg = (ph + ch + mh)/3.0f;
        if(avg>=40 && ph >=33 && ch >= 33 && mh >=33){
            System.out.println("Well done you did it  'Passed' ");
        }
        else {
            System.out.println("hah Chutiya");
        }
        */

        //  Question3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
         float tax =0;
         float income = sc.nextFloat();
         if (income < 2.5){
             System.out.println("you deserve death not tax");
             tax = tax +0;

         }
        else if (income > 2.5f && income < 5f){
            System.out.println("less poor man you have to pay tax");
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income >5f && income <10f) {
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (income - 5f);
        }

         else if (income >10f) {
             tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.2f * (10.0f - 5f);
             tax = tax + 0.3f * (income - 10.0f);

         }
        System.out.println("the total tax paid by the employee is :" + tax );


    }
}
