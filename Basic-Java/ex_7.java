package Learningjava.basicjava;

import java.util.Scanner;

public class ex_7 {

    static  void table(int n){


        int product =1;
        for (int i =1; i<=10;i++){
            product = n *i;
            System.out.println(product);

        }


    }

    public static void main(String[] args) {
        System.out.println("enter any number to get result");

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        table(n);



    }
}
