package Learningjava.basicjava;

public class overloading_32 {

    static void boo(){
        System.out.println("ha good morning");
    }
    static void boo(int a){
        System.out.println("ha " +a + " good morning");
    }

//    static void change(int a){
//        a = 90;
//    }
//
//    static void change2(int[] arr){
//        arr[0] = 90;
//    }



    static void TellJoke(){
        System.out.println("hahaha haa aaaa hahhhhh oooohhhh");

    }

    public static void main(String[] args) {

        //TellJoke();
        //int [] marks = {98,56,48,75,15,65,48};
//        // case 1: changing the integer
//        int x = 45;
//        change(x);
//        System.out.println(x);


        // case 1: changing the ARRAY

        //change2(marks);
        //System.out.println(marks[0]);

        boo();
        boo(3000);



    }
}
