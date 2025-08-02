    

import java.util.Scanner;

public class ex_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nm = sc.nextInt();
        int frac =1;
        for (int i=1; i<=nm; i++){
            frac = frac*i;
            System.out.println(frac);
        }
    }
}
