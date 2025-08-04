
interface camera1{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
   default void recordIn4k(){
    greet();
    System.out.println("record in 4k");
   };
}

interface wifi1{
    String[] getNetwork();
    void connectToNetwork(String network);
}



 class cellPhone1{
    
    public void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickcall(){
        System.out.println();
    }
    public void takeSnap(){
        System.out.println("take a snap...");
    }
 }

 class SmartPhone1 extends cellPhone1 implements wifi1 , camera1{

    @Override
    public void recordVideo() {
        System.out.println("recording video..");
    }

    // public void recordIn4k(){
    //     System.out.println("take snap and record it in 4k");
    // }

    @Override
    public String[] getNetwork() {
        System.out.println("getting network List...");
        String[] networkList = {"dat" , "paaa", "anjali"};
        return networkList;
       
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting" +network);
    } 

 }

public class polymorphism {
    public static void main(String[] args) {

        camera1 mn = new SmartPhone1(); // use camera only
        mn.takeSnap();

        // mn.pickcall();  not allowed
        
       
        
    }
}
