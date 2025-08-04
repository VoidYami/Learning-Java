import java.util.Scanner;

class Myexception extends Exception{
    public String toString(){
        return super.toString() + "i am getMessage()"; 
    }
    public String getMessage(){
        return super.getMessage() + "i am getMessage()";
    }
}


public class Exception_class {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new Myexception();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("hell haa finished");

        }
        
    }
}
