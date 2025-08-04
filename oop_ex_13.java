import java.util.Scanner;

public class oop_ex_13 {
    public static void main(String[] args) {
        // int a = 1  // syntax error
        
        // int age = 78;    logical error
        // int year_born = 2000-age;

        // System.out.println(8/0);

        //// problem 2 

        // try{
        //     // System.out.println("hellow");
        //     int a  = 999/0;
        // }catch(IllegalAccessError e){
        //     System.out.println(e.getMessage());
        //     System.out.println("hahha");

        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        //     System.out.println("heeeee");

        // }

        //  problem 3

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] =25;
        marks[1] =98;
         marks[2] =75;
        int index;

        Scanner sc = new Scanner(System.in);
        int i =0;

        while(flag && i<5){
            try{
            index = sc.nextInt();
            System.out.println("the marks[index] is "+ marks[index]);
            break;

            }catch(Exception e){
                System.out.print("Invalid index");
            i++;

            }
        }

        if (i>=5){
            System.out.println("error");
        }
    }
}
