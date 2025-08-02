    

public class ex_5_6 {
    public static void main(String[] args) {
//        for(int i=4; i>=1; i--){
//            if (i==4){
//                System.out.println("****");
//            }
//            if(i==3){
//                System.out.println("***");
//            }
//            if(i==2){
//                System.out.println("**");
//            }
//            if(i==1){
//                System.out.println("*");
//            }
//        }



        for(int i =1; i<=4; i++){
            for(int j =4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
