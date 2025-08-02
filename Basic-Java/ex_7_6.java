    

public class ex_7_6 {

    static void starrec(int x){
        if(x>0){
            starrec(x-1);
            for (int i =0; i<x; i++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }


    }


    static void reversestar(int x){
        if(x>0){
            reversestar(x-1);

            for(int j = 1; j>= x; j--){

                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

//        int a = 4;
//        starrec(a);


        int b = 5;
        reversestar(b);

    }
}
