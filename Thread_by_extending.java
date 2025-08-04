

// public void argument(int a, int b){
// argument(5, 8); // actual value is know as argument
// }

class myclass extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<=10000) {
            System.out.println("thread 1 for cooking");
            System.out.println("this is good");
            i++;
        }
    }
}
class myclass2 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (i<=10000) {
            System.out.println("thread 2 for whatsapp");
            System.out.println("this is bad");
            i++;
        }
    }
}

public class Thread_by_extending {
    public static void main(String[] args) {
        myclass c1 = new myclass();
        myclass2 c2 = new myclass2();
        c1.start();
        c2.start();
        
    }
}
