package Learningjava.basicjava;

public class logical_17 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a || b && c){// || use for not and && use for "and"
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("for not is %s");
        System.out.println(!a);
    }
}
