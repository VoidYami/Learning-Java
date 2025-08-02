package Learningjava.basicjava;

public class ex_6_3 {
    public static void main(String[] args) {
        int [] marks = {98,35,64,75,19,75,89};
        int sum = 0;
        int avg = 7;

        for(int elements : marks){
            sum = sum+elements;
            System.out.print("");

        }

        System.out.println(sum/avg);


    }
}
