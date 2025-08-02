package Learningjava.basicjava;

public class Rershion_34 {


    static void series(int x){
       int a=0;
        int b=1;
        int c;


        System.out.print(a+" ");
        System.out.print(b+"");
//        System.out.println(a+b);
        for (int i =2; i< x;i++){
            c = a +b;
            System.out.print(" "+c);
            a =b;
            b=c;


        }

    }




    // factorial (n) = n * factorial(n-1)

//    static int factorial(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            return n * factorial(n-1);
//        }
//
//
//    }
//    static int factorial_iterative(int n){
//        if (n==0 || n==1){
//            return 1;
//        }else {
//            int product = 1;
//            for(int i =1;i<=n;i++){
//                product = i * product;
//            }
//            return product;
//        }
//
//
//    }

    public static void main(String[] args) {
//        int n = 5;
//        System.out.println("the value of factorial 5 is equal to" +factorial(4));
//
//        System.out.println("by iteration method" + factorial_iterative(5) );



//        quick question

        int a =20;


        series(a);

    }

}
