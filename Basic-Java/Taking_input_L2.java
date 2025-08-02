    

import java.util.Scanner;

public class Taking_input_L2 {

    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
//        boolean aa = sc.hasNextInt();
//        System.out.println(aa);
        System.out.println("Enter second number");
        int b = sc.nextInt();
//        boolean bb = sc.hasNextInt();
//        System.out.println(bb);
        int sum = a + b;
        System.out.println("the sum of two numbers is %d,sum ");
        System.out.println(sum);

    }
}
