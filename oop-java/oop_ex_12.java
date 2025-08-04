class ex extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class ex2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
            try{
                Thread.sleep(250);
            }catch(InterruptedException e){
               e.printStackTrace();

            }

        }
    }
}class ex1 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");

        }
    }
}

public class oop_ex_12 {
    public static void main(String[] args) {
        ex myex = new ex();
        ex2 myex2 = new ex2();

        myex.start();
        myex2.start();

        
    }
}
