    

public class ex_7_4 {

    static int fibo(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }


    public static void main(String[] args) {
        int a = fibo(5);
        System.out.println(a);

    }
}
