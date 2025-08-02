    

import java.util.Scanner;

public class ex_7_3 {

    static void start(int x){

        for (int i =1;i<=x; i++){
            for(int j =x;j>=i; j--){

                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        start(a);

    }
}
