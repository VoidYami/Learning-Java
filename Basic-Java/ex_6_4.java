package Learningjava.basicjava;

public class ex_6_4 {
    public static void main(String[] args) {
       int [][] mat1 = {{2,4,6},
                         {1,2,3}
       };

        int [][] mat2 = {{1,2,3},
                {2,4,6}
        }; int [][] sum = {{0,0,0},
                {0,0,0}
        };

        for (int i =0; i<= mat1.length; i++){
            for (int j =0; j<=mat2.length; j++){
                sum [i][j] = mat1[i][j] + mat2[i][j];
//                System.out.format("the given matrix i=%d and j=%d",i ,j);
                System.out.print(sum[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
