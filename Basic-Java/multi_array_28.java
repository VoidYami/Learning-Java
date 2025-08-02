package Learningjava.basicjava;

public class multi_array_28 {
    public static void main(String[] args) {
        int[][] waha = new int[2] [3];
        waha [0] [0] =101;
        waha [0] [1] =102;
        waha [0] [2] =103;
        waha [1] [0] =201;
        waha [1] [1] =202;
        waha [1] [2] =203;

        for (int i=0; i< waha.length; i++){
            for (int j=0; j< waha[i].length; j++){
                System.out.print(waha[i][j]);
                System.out.print("  ");


            }
            System.out.println("  ");
        }


    }
}
