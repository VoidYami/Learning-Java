package Learningjava.basicjava;

public class Methods_in {

    static int logic(int x, int y) {

        int z;
        if (x > y) {
            z = x + y;

        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5;
        int b =7;
        int c;
 /// ////// using object creation
//        Methods_in haha = new Methods_in();
        c = logic(a , b);
        System.out.println(c);


        int a1 =4;
        int b1 =2;
        int c1;

        c1 = logic(a1,b1);
        System.out.println(c1);

        /// /




    }
}