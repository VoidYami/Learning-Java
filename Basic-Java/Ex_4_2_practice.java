    

import java.util.Scanner;

public class Ex_4_2_practice {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int year = Sc.nextInt();
        if (year%4==0 && year%100!=0 && year%400==0){
            System.out.println(year+"this year is leap year");
        }
        else
        {
            System.out.println("fuck off");
        }

    }
}
