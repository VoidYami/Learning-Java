    

public class Associativity_operator_L4 {
    public static void main(String[] args) {

        //precedence and Associative
        int a = 2*4-24/2;
        System.out.println(a);
        /*
            8 -24/2
            8-12
            -4
         */

        int b =20/2-10*4;
        System.out.println(b);
        /*
            10-10*4
            10-40
            -30

         */

        //quick quiz

        int x = 10;
        int y = 6;
        int z = 12;
        int k = (x-y)/2;
        System.out.println(k);
        int L = x*y-z;
        System.out.println(L);

        int m = (y*y)-4*x*z/(2*x);
        System.out.println(m);
        int i = 4;
        System.out.println();

        ++i;
        System.out.println(i);


    }
}
