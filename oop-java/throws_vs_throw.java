 
public class throws_vs_throw {
   public static int divide(int a, int b)throws ArithmeticException{
       
            int result = a/b;
            return result;
        }
        public static void main(String[] args) {
            
            try{
                int C = divide(6,0);
                System.out.println(C);
            
            }catch(ArithmeticException e){
                System.out.println("Exception");
            }
           
    }
}
