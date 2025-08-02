package Learningjava.basicjava;

public class ex_6_6_array {
    public static void main(String[] args) {
        int [] arr ={65,77,69,99,48,67,79,71,50,17};
        int sort=0;

        boolean IsSorted = true;

        for (int i =1; i<= arr.length; i++){
            if (arr[i] > arr[i+1]){
                IsSorted = false;
                break;
            }
        }
        if (IsSorted){
            System.out.println("the given array is shorted");
        }
        else {
            System.out.println("the given array is not shorted");
        }

    }
}
