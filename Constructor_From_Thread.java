// class myThread extends Thread{
//    public myThread(String name){
//     super(name);
//    }
//    @Override
//    public void run() {
//     int i =0;
//     while (i <2) {
//         System.out.println("i am a Thread");
//         i++; 
        
//     }
//    }
// }

class myThread2 implements Runnable{
    public myThread2(String name){
        super();
    }
    public void run(){
        int i =1;
        while (i<=2) {
        System.out.println("hahah");
        i++;
            
        }

    }
}

public class Constructor_From_Thread {

    public static void main(String[] args) {
        myThread2 dark = new myThread2("yash");

        Thread G1 = new Thread(dark);
        System.out.println("the id of the thread is "+ G1.getId());
        
    }
}