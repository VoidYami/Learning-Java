    

public class ex_6_2_28 {
    public static void main(String[] args) {

        int [] marks ={98,65,77,69,99,48,67,79,71,50,17};
       int val = 65;
       boolean isInArray = false;

       for(int elements : marks){
           if (val == elements){
               isInArray = true;
               break;
           }
       }
       if (isInArray){
           System.out.println("that element is present in that array");
       }
       else {
           System.out.println("that is not present int given array");
       }





    }
}
