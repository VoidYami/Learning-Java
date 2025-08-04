class myNew extends Thread{
    public void run(){
        while(true){
            System.out.println("hahah");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}class myNew1 extends Thread{
    public void run(){
        while(true){
            System.out.println("meow meow");

        }
    }
}

public class Method_in_Thread {
    public static void main(String[] args) {
        myNew nm =new myNew();
        myNew1 nm1 =new myNew1();
        nm.start();
        // try{
        //     nm.join();

        // }catch(Exception e){
        //     System.out.println(e);
        // }
          
      

        nm1.start();
        
    }
}
