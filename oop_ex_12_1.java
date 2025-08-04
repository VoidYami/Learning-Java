// class ex extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("good morning");
//         }
//     }
// }

class ex3 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");

        }
    }
}

public class oop_ex_12_1 {
    public static void main(String[] args) {
        // ex p1 = new ex();
        ex3 p2 = new ex3();


        // p1.setPriority(10);
        // // myex.start();
        // System.out.println(p1.getPriority());
        // System.out.println(p1.getState());

        p2.setPriority(8);
        System.out.println(p2.getPriority());
        System.out.println(p2.currentThread());


        // myex3.start();
        
    }
    
}
