package Learningjava.basicjava;

import java.util.Scanner;

public class ex_7_2 {

//    static int sum(int n){
//        int sum =0;
//        for(int i =1; i<=n; i++){
//            sum = sum +i;
//        }
//        System.out.println(sum);
//        return sum;
//    }
    static int sumrec(int n){
        if (n==1){
            return 1;
        }
        return n + sumrec(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumrec(a));

    }
}
