    

/// problem no 5

public class ex_6 {
    public static void main(String[] args) {
//        int [] haha = {98,56,32,65,87,75};
//        int sum =0;
//
//        for (int i= haha.length-1; i>=0; i--){
//            System.out.println(haha[i]);
//        }

////////// other ways to solve this problem


        int [] arr = {1,2,3,4,5,6,7};
        int l = arr.length;
        int a = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<a; i++){
            /// |3| |4| | | -> || |4| |3| -> |4| | | |3| -> |4| |3| ||

            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for (int element :arr){
            System.out.println(element);
        }
    }
}

