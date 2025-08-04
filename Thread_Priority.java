class myThread extends Thread{
   public myThread(String name){
    super(name);
   }
   @Override
   public void run() {
    int i =0;
   

    while (i <10000) {
        System.out.println("hahah" + this.getName());
        i++; 
        
    }
   }
}

public class Thread_Priority {
    public static void main(String[] args) {
        myThread dark = new myThread("yash");
        myThread dark1 = new myThread("yash1");
        myThread dark2 = new myThread("yash2(its very important)");
        myThread dark3 = new myThread("yash3");
        myThread dark4 = new myThread("yash4");
        myThread dark5 = new myThread("yash5");
        myThread dark6 = new myThread("yash6");

        dark2.setPriority(Thread.MAX_PRIORITY);
        dark3.setPriority(Thread.MIN_PRIORITY);
        dark1.setPriority(Thread.MIN_PRIORITY);
        dark4.setPriority(Thread.MIN_PRIORITY);
        dark5.setPriority(Thread.MIN_PRIORITY);
        dark6.setPriority(Thread.MIN_PRIORITY);
        dark.setPriority(Thread.MIN_PRIORITY);
      

        dark.start();
        dark1.start();
        dark2.start();
        dark3.start();
        dark4.start();
        dark5.start();
        dark6.start();
        

        
    }
}
